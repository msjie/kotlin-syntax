package cn.yusite.example.kotlin.`class`.inher

abstract class Rectangle {
    abstract var borderColor: String
//        get() = "black"
    open fun draw() {
        println("Rectangle draw method")
    }
}

abstract class GenRectangle : Polygon {
    abstract override fun draw()
}

interface Polygon {
    fun draw() {
        println("Polygon draw method")
    }
}

/**
 * 为避免歧义，必须覆盖draw方法
 */
class Square : Rectangle(), Polygon {
//    override var borderColor: String
//        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
//        set(value) {}
    override var borderColor: String = "test"
        set(value) {
            println("borderColor value is $borderColor")
            println("set method $value")
        }

    override fun draw() {
        super<Rectangle>.draw()
        super<Polygon>.draw()
    }
}

fun main() {

    var square = Square()
    square.draw()
    println( "before" + square.borderColor)
    square.borderColor = "abc"
    println("after" + square.borderColor)
}