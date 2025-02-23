package module1

fun main() {
    Chapter4_When.whenEx1()
    Chapter4_When.whenEx2()
}

class Chapter4_When {
    companion object {
        /**
         * - Kotlin 에서 when 절은 Java 의 switch 문을 대체합니다.
         * - 참고로 in 키워드는 contains 함수, .. 키워드는 rangeTo 함수에 대한 키워드입니다.
         */
        fun whenEx1() {
            val score: Int = 10

            val grade: String = when(score) {
                in 70 ..100 -> "A"
                in 40 ..69 -> "B"
                in 0..39 -> "C"
                else -> throw IllegalArgumentException("Out of range!")
            }

            println(grade)
        }

        fun whenEx2() {
            val anyValue: Any = 10

            val type: String = when(anyValue) {
                is String -> "Value is String "
                is Number -> "Value is Number"
                is Boolean -> "Value is Boolean"
                else -> throw IllegalArgumentException("Not supported type!")
            }

            println(type)
        }
    }
}