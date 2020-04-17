package cn.yusite.example.kotlin.basic.string

import cn.yusite.example.kotlin.basic.characters.decimalDigitValue as t
import cn.yusite.example.kotlin.basic.characters.*

fun main() {

    val str = "我是kotlin粉丝"
    for (c in str) {
        println(c)
    }
    println(str[str.length - 1])
    var s = "test".repeat(2)
    println(s)
    val test = """
               |1testabc        
         """.trimMargin()
    println(test.length)
    println(test[test.lastIndex])
    println("test first ${test.first()}")
    t(test.first())
    cn.yusite.example.kotlin.basic.characters.decimalDigitValue(test.first())
}