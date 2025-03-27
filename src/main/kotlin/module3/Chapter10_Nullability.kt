package module3

fun main() {
    println(Nullability.lengthOf("Hello"))
    println(Nullability.lengthOf(null))
    Nullability.printWithNPE("Hello")
    Nullability.printWithNPE(null)
}

class Nullability {
    companion object {
        /**
         * - Nullable: Kotlin 에서는 ? 키워드를 통해 Nullable 을 표현하고, null 할당을 허용합니다.
         * - Safe Call: ? 키워드를 사용한 타입은 ?. 키워드를 통해 NPE 없이 메서드 혹은 프로퍼티를 호출할 수 있습니다.
         */
        fun lengthOf(message: String?): Int? {
            return message?.length
        }

        /**
         * Non-null Assertion Operator:
         * !! 키워드를 사용해 절대 Null 이 들어올 수 없음을 표현할 수 있습니다. (단, null 이 들어올 경우 NPE 를 던집니다.)
         */
        fun printWithNPE(message: String?) {
            println(message!!)
        }

        /**
         * Elvis Operator:
         * ?: 키워드를 사용해 null 이 들어올 경우 기본 값을 할당할 수 있습니다. (throw Exception 도 가능)
         */
        fun print(message: String?) {
            println(message ?: "Input is Null")
        }
    }
}
