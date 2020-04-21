package cn.yusite.example.kotlin.`fun`

fun foo(bar: Int = 0, baz: Int = 1, qux: () -> Unit) {

    println("bar value is $bar")
    qux.invoke()
}

fun main() {

    foo(1) { println("hello1") } // 使用默认值 baz = 1
    foo(qux = { println("hello2") }) // 使用两个默认值 bar = 0 与 baz = 1
    foo { println("hello3") }
}
