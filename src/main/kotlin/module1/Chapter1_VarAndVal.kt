package module1

fun main() {

}

class Chapter1_VarAndVal {
    companion object {
        /**
         * 다음 코드에서 str 변수가 값을 변경하지 않는다면 ___로 표시된 빈칸을 무엇으로 채워야 할까요?
         * ```kotlin
         * fun main() {
         *     ___ str = "ABC"
         *     println(str)
         * }
         * ```
         */
        fun valEx() {
            val str = "ABC"
            println(str)
        }

        /**
         * 다음 코드에서 str 변수가 함수 내에서 값을 변경하는 경우 ___로 표시된 빈칸을 무엇으로 채워야 할까요?
         * ```kotlin
         * fun main() {
         *     ___ str = "ABC"
         *     str = "XYZ"
         *     println(str)
         * }
         * ```
         */
        fun varEx() {
            var str = "ABC"
            str = "XYZ"
            println(str)
        }
    }
}