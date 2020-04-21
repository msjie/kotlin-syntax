package cn.yusite.example.kotlin.`class`.objexp

open class A(x: Int) {
    public open val y: Int = x
}

interface B { /*……*/ }

//object expressions
//无需声明，直接进行扩展
val ab: A = object : A(1), B {
    override val y = 15
}

fun main() {

    println(ab)
}