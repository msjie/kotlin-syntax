package cn.yusite.example.kotlin.`fun`


class HTML {
    fun body() {
        println("body method")
    }
}

fun html(init: HTML.() -> Unit): HTML {
    val html = HTML() // 创建接收者对象
    //html.init() // 将该接收者对象传给该 lambda
    init.invoke(html)
    return html
}

//扩展方法(函数)
val sum = fun Int.(other: Int): Int = this + other

val sum0: Int.(Int) -> Int = { other -> plus(other) }

fun main() {

    var html = html {
        // 带接收者的 lambda 由此开始
        println("lambda method exec")
        body() // 调用该接收者对象的一个方法
    }
    println(html)
    println(1.sum(2))
    println(1.sum0(2).toString() + "sum0 method ")
}