package cn.yusite.example.kotlin.`class`.em

enum class Color(var rgb: Int) {

    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

fun main() {

    println(Color.BLUE.name)
    Color.values().forEach {
        println(it.rgb)
        println(it.name)
        println("it.ordinal value ${it.ordinal}")
    }
    println(Color.valueOf("RED"))
    println(Color.valueOf("0xFF0000"))
}