package cn.yusite.example.kotlin.col

fun main() {
//sampleStart
    val numbers = setOf(1, 2, 3, 4)
    println("Number of elements: ${numbers.size}")
    if (numbers.contains(1)) println("1 is in the set")
    val numbersBackwards = setOf(4, 3, 2, 1)
    //两个集合元素具有相同的大小，且一个集合中所有元素存在于另一个集合中则相等
    println("The sets are equal: ${numbers == numbersBackwards}")
//sampleEnd
}