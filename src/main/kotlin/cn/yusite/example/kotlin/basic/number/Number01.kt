package cn.yusite.example.kotlin.basic.number

fun main(args: Array<String>) {

    val one = 1 // Int
    val threeBillion: Long = 300000000000000000 // Long
    val oneLong = 1L // Long
    val oneByte: Byte = 1
    val pi = 3.14 // Double
    val e = 2.7182818284 // Double
    val eFloat = 2.7182818284f // Float, actual value is 2.7182817
    //eFloat = 2.234F Val cannot be reassigned
    var c = 1
    c = 300000000000000000.toInt();
    println(eFloat)
    val x = 5 / 2
    //println(x == 2.5) // ERROR: Operator '==' cannot be applied to 'Int' and 'Double'
    println(x == 2)

    println(1 shl 2)

}