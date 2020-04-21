package cn.yusite.example.kotlin.`class`.inner

class Outer {
    var outerA: Int = 1
    //类可以嵌套
    class Nested {
        fun foo() = 2
    }
    inner class Inner {
        fun innerFoo() = outerA
    }
}

fun main() {

    println(Outer.Nested().foo())
    println(Outer().Inner().innerFoo())
}