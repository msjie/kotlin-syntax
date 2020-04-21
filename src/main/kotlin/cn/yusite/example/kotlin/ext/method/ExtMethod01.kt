package cn.yusite.example.kotlin.ext.method


fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
}

fun main() {

    var mutableList = MutableList<Int>(3) { it }
    mutableList.swap(0,2)
    println(mutableList)
}

