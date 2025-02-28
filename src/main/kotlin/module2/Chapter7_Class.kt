package module2

import java.util.PriorityQueue
import java.util.Queue

fun main() {
    Employee.test()
    Practice.ScoreBoard.test()
}

/**
 * - 클래스에서 val 또는 var로 선언한 프로퍼티는 자동으로 getter가 생성됨.
 * - var일 경우 setter도 자동 생성됨.
 */
class Employee (
    val name: String,
    var position: String
) {
    companion object {
        fun test() {
            val employee = Employee("Bob", "Manager")
            println(employee.name)
            println(employee.position)
            println(employee.description)
        }
    }
    var description: String = "$name is $position"
        get() = field
        set(value) {
            field = value
        }
}

/**
 * 클래스 활용 과제
 * 1. Store and display the player’s full name
 * 2. Store, manipulate and display the player’s score data
 * 3. Store and display a personal best score (players get a score for each level played)
 * 4. Display the winning player’s name and their total score and their best level score
 */
class Practice {
    class Player (
        val firstName: String,
        val lastName: String
    ) {
        var totalScore: Int = 0
        var bestScore: Int = 0

        fun displayFullName(): String = "$firstName $lastName"
        fun updateScore(value: Int) {
            bestScore = Math.max(bestScore, value)
            totalScore += value
        }
    }

    class ScoreBoard {
        companion object {
            fun test() {
                val player1 = Player("Nicola", "Tesla")
                val player2 = Player("Thomas", "Edison")
                val scoreBoard = ScoreBoard()
                scoreBoard.play(20, player1)
                scoreBoard.play(35, player2)
                scoreBoard.play(25, player1)
                scoreBoard.play(45, player2)
                scoreBoard.play(20, player1)
                scoreBoard.play(30, player1)
                scoreBoard.play(55, player2)
                scoreBoard.displayWinner()
            }
        }

        val scoreOfPlayers: Queue<Player> = PriorityQueue(compareByDescending { it.totalScore })

        fun play(score: Int, winnerOfRound: Player) {
            winnerOfRound.updateScore(score)
            scoreOfPlayers.offer(winnerOfRound)
        }

        fun displayWinner() {
            val winner = scoreOfPlayers.peek()
            println("Winner is ${winner.displayFullName()}, total ${winner.totalScore}, best ${winner.bestScore}")
        }
    }
}