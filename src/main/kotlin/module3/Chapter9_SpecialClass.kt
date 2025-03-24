package module3

fun main() {
    DataClass.instance()
    EnumClass.instance()
}

/**
 * 값을 저장하는 용도로 사용하는 클래스 -> 사용자 정보, API 응답, DTO 등
 * - toString()
 * - equals()
 * - hashCode()
 * - copy(): 갹체를 복사
 * - componentN(): 각 속성을 개별 변수로 추출
 */
class DataClass {
    data class User(val name: String, val age: Int)

    companion object {
        fun instance() {
            val user1 = User("Amy", 10)
            val user2 = User("Amy", 10)
            println(user1 == user2)    // equals() 와 동일
            println(user1 === user2)

            val (name, age) = user1
            println("$name : $age")

            val newUser = user1.copy(name = "Dave")
            println(newUser)
        }
    }
}

/**
 * 고정된 상수 값 정의를 용도로 사용하는 클래스 -> 상태(State), 타입(Type), 열거형 값
 */
class EnumClass {
    companion object {
        fun instance() {
            println(Week.MON)
            println(Week.MON.ordinal)
        }
    }

    enum class Week (
        val value: Int
    ) {
        MON(1),
        TUE(2),
        WED(3),
        THU(4),
        FRI(5),
        SAT(6),
        SUN(7)
    }
}

/**
 * 동일한 파일 내에서 하위 클래스를 정의하는 용도로 사용하는 클래스
 */
class SealedClass {
    sealed class Animal {
        object Unknown : Animal() // 객체 선언 가능

        fun describe(animal: Animal): String {
            return when (animal) {
                is Dog -> "강아지: ${animal.name}."
                is Cat -> "고양이: ${animal.age}."
                is Unknown -> "동물."
            }
        }
    }

    class Dog(val name: String) : SealedClass.Animal()
    class Cat(val age: Int) : SealedClass.Animal()
}

class AnnotationClass {
    annotation class CustomAnno(val description: String)
}