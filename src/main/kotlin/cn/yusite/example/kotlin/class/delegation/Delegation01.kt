package cn.yusite.example.kotlin.`class`.delegation

interface Base {
    fun print()
}
class BaseImpl(private val x: Int) : Base {
    override fun print() { print(x) }
}

class Derived(b: Base) : Base by b

fun main() {
    val b = BaseImpl(10)
    Derived(b).print()
}