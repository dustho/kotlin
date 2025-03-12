package module2

fun main() {
    Interface.instance()
    Interface.cast()
    Open.instance()
}

class Interface {
    companion object {
        fun instance() {
            val dog = Dog("Doggy", "Meat")
            dog.pet()
        }

        fun cast() {
            val dog: Animal = Dog("Doggy", "Meat")
            println(dog is Animal)
            println(dog is Dog)
            (dog as Dog).bite()
        }
    }

    interface Animal {
        companion object {
            var sharedProperty: String = ""
            fun sharedMethod() {
                println("hello")
            }
        }

        val breed: String
        fun pet()
        fun default() {
            println("hello")
        }
    }

    class Dog (
        val name: String,
        override val breed: String
    ): Animal {
        override fun pet() {
            println("Waff")
        }

        fun bite() {
            println("Wang")
        }
    }
}

/**
 * open 키워드는 클래스나 메서드를 상속(override)할 수 있도록 허용하는 역할을 합니다.
 * (open 키워드가 붙으면 override 를 선택적으로 할 수 있고, abstract 키워드가 붙으면 override 가 강제됩니다.)
 * Kotlin 의 클래스와 메서드는 final(즉, 상속 및 오버라이드 불가능) 상태이므로,
 * 다른 클래스가 이를 상속하거나 오버라이드하려면 open 키워드를 명시적으로 선언해야 합니다.
 * 쉽게 말해, Java 에서 상속 가능한 일반 클래스로 생각하면 됩니다.
 */
class Open {
    companion object {
        fun instance() {
            val poodle = Poodle("brown")
            poodle.pet()
            poodle.bite()
        }
    }

    open class Dog (
        open val color: String
    ) {
        open fun pet() {
            println("Waff")
        }

        fun bite() {
            println("Wang")
        }
    }

    class Poodle (
        override val color: String
    ): Dog(color) {
        override fun pet() {
            println("Waf")
        }
    }
}

class Abstract {
    abstract class Shape (
        val type: ShapeType = ShapeType.ETC
    ) {
        open fun drawLineEtc() {
            println(ShapeType.ETC)
        }

        abstract fun drawLine()
    }

    class Rectangle (
        var width: Int,
        var height: Int
    ): Shape(type = ShapeType.Rectangle) {
        override fun drawLine() {
            println(ShapeType.Rectangle)
        }
    }

    enum class ShapeType {
        Rectangle,
        Triangle,
        Circle,
        ETC
    }

}

