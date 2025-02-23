package module1

fun main() {
    Chapter2_Boolean.operatorEx1()
    Chapter2_Boolean.operatorEx2()
}

class Chapter2_Boolean {
    companion object {
        /**
         * - Kotlin 에서 AND 연산자는 and 혹은 && 키워드로 사용 가능합니다.
         * - Kotlin 에서 OR 연산자는 or 혹은 || 키워드로 사용 가능합니다.
         * - Kotlin 에서 NOT 연산자는 ! 키워드로 사용가능하며, 하나의 변수에 여러번 사용될 수 있습니다.
         * - 참고로 and, or 연산자는 infix 함수입니다. (https://kotlinlang.org/docs/functions.html#infix-notation)
         */
        fun operatorEx1() {
            println(true and true) // true
            println(true && true) // true
            println(true or false) // true
            println(true || false) // true
            println(!!true) // true

        }

        /**
         * - Kotlin 에서 == 키워드는 equals 함수에 의한 비교를 의미합니다.
         * - Kotlin 에서 === 키워드는 주소 값에 대한 비교를 의미합니다.
         */
        fun operatorEx2() {
            println("A" == "A") // true
            println("A" === "A") // true -> 동일한 문자열은 String Pool 에서 참조
        }
    }
}