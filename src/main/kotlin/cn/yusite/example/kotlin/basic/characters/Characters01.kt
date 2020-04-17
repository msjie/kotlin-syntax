package cn.yusite.example.kotlin.basic.characters

fun decimalDigitValue(c: Char): Int {
    if (c !in '0'..'9')
        throw IllegalArgumentException("Out of range")
    return c.toInt() - '0'.toInt() // Explicit conversions to numbers
}

fun main(args: Array<String>) {

    var a: Char = 'A'
    println(a)
    println(a.toByte())
    println(decimalDigitValue('1'))
}