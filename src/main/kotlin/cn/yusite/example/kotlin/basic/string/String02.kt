package cn.yusite.example.kotlin.basic.string

fun main() {

    var a = 1
    println(" a =  ${a.let { a += 1 }}")
    println(a)
    var c = """
     a = $a 
    """.trim()
    println(c)
}