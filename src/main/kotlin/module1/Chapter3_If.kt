package module1

fun main() {
    Chapter3_If.ifIsExpression()
}

class Chapter3_If {
    companion object {
        /**
         * - Kotlin 에서 if 문은 Expression 으로 사용될 수 있습니다.
         * - 따라서, 반환된 결과를 변수에 할당할 수 있습니다.
         */
        fun ifIsExpression() {
            val num1: Int = 10
            val num2: Int = 20

            val result: String =
                if (num1 < num2) "num2 is greater than num1"
                else if (num1 > num2) "num1 is same as num2"
                else "num1 is not greater than num2"

            println(result)
        }
    }
}