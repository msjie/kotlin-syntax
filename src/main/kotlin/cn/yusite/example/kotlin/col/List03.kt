package cn.yusite.example.kotlin.col

fun main() {
//sampleStart
    val numbers = mutableListOf(1, 2, 3, 4)
    numbers.add(5)
    numbers.removeAt(1)
    println(numbers)
    numbers[0] = 0
    println(numbers)
    numbers.shuffle()
    println(numbers)
//sampleEnd
}