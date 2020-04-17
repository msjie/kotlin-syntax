package cn.yusite.example.kotlin.basic.arrays

fun main() {

    var array = Array(2) { i -> i }
    array.forEach { println(it) }

    var intArrayOf = intArrayOf(1, 2, 3, 4, 5)
    var a: (Int, Int) -> Int = { r, i -> r + i }
    println(intArrayOf.fold(0) { r, i -> r + i })
    println(intArrayOf.fold(0, a))

    for (i in array) {

    }
    array.iterator()
}