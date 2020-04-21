package cn.yusite.example.kotlin.ext.method

fun main() {
    //sampleStart
    open class Shape
    class Rectangle: Shape()
    fun Shape.getName() = "Shape"
    fun Rectangle.getName() = "Rectangle"
    fun printClassName(s: Shape) {
        //调用的函数取决于s类型
        println(s.getName())
    }
    printClassName(Rectangle())
//sampleEnd
}