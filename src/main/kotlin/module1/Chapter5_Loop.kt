package module1

fun main() {
    Chapter4_When.whenEx1()
    Chapter4_When.whenEx2()
}

class Chapter5_Loop {
    companion object {
        /**
         * - Kotlin 에서 for 문은 Java 와 달리 in 키워드를 통해 작성됩니다.
         * - .., until, downTo 키워드를 통해 범위를 지정할 수 있습니다.
         * - step 키워드를 통해 증감을 조절할 수 있습니다.
         */
        fun forEx1() {
            for (i in 1..5 step 2) {
                println(i)
            }
        }

        fun forEx2() {
            for (i in 1 until 5 step 2) {
                println(i)
            }
        }

        fun forEx3() {
            for (i in 5 downTo 1 step 2) {
                println(i)
            }
        }
    }
}