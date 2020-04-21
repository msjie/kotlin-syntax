package cn.yusite.example.kotlin.ext.method

fun main() {
    //sampleStart
    class Example {
        fun printFunctionType() { println("Class method") }
    }
    fun Example.printFunctionType() { println("Extension function") }
    fun Example.printFunctionType(i: Int) { println("Extension function") }
    Example().printFunctionType()
    Example().printFunctionType(1)
//sampleEnd
}