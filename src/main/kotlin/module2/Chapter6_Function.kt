package module2

fun main() {
    Chapter6_Function.functionWithDefaultArgs()
    Chapter6_Function.functionWithNamedArgs()
}

class Chapter6_Function {
    companion object {
        /**
         * - Kotlin 에서는 함수 파라미터의 기본값을 지정할 수 있습니다.
         * - 이로 인해 함수의 불필요한 오버로딩을 줄일 수 있습니다.
         */
        fun functionWithDefaultArgs() {
            fun getAverage(total: Int = 0, numOfPeople: Int = 1): Int {
                return total / numOfPeople;
            }

            println(getAverage());
        }

        /**
         * - Kotlin 에서는 함수 인자의 값을 파라미터 이름으로 지정해 넘겨줄 수 있습니다.
         * - 이를 이용해ㅑ 정적 팩토리 함수를 만들면, 일부 상황에서 빌더 패턴을 대체 가능합니다.
         */
        fun functionWithNamedArgs() {
            fun getAverage(total: Int = 0, numOfPeople: Int = 1): Int {
                return total / numOfPeople;
            }

            println(getAverage(numOfPeople = 3, total = 30));
        }
    }
}