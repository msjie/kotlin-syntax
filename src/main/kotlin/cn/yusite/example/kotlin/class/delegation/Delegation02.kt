package cn.yusite.example.kotlin.`class`.delegation

interface BaseDelegation {
    fun printMessage()
    fun printMessageLine()
}
class BaseDelegationImpl(val x: Int) : BaseDelegation {
    override fun printMessage() { print(x) }
    override fun printMessageLine() { println(x) }
}

class DerivedDelegation(b: BaseDelegation) : BaseDelegation by b {

    override fun printMessage() {
        print("abc")
    }
}

fun main() {
    val b = BaseDelegationImpl(10)
    DerivedDelegation(b).printMessage()
    DerivedDelegation(b).printMessageLine()
}