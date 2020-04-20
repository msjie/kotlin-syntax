package cn.yusite.example.kotlin.`class`.inher

interface Factory<T> {
    fun create(): T
}
class A {
    companion object : Factory<A> {
        override fun create(): A = A()
    }
}
val f: Factory<A> = A

fun main() {
    println(f.create())
}