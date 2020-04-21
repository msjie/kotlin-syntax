package cn.yusite.example.kotlin.col

fun main() {
//sampleStart
    val numbersMap = mutableMapOf("one" to 1, "two" to 2)
    numbersMap["three"] = 3
    numbersMap["one"] = 11
    println(numbersMap)
//sampleEnd
}