package cn.yusite.example.kotlin.`class`.em

import java.util.function.BinaryOperator
import java.util.function.IntBinaryOperator
//sampleStart
enum class IntArithmetics : BinaryOperator<Int>, IntBinaryOperator {
    PLUS {
        override fun apply(t: Int, u: Int): Int = t + u
    },
    TIMES {
        override fun apply(t: Int, u: Int): Int = t * u
    };
    //提供统一实现
    override fun applyAsInt(t: Int, u: Int) = apply(t, u)
}
//sampleEnd
fun main() {
    val a = 13
    val b = 31
    println(IntArithmetics.PLUS.apply(a, b))
    println(IntArithmetics.PLUS.apply {
        println(this.apply(a, b))
    })
    println("========================")
    for (f in IntArithmetics.values()) {
        println(f)
        println("$f($a, $b) = ${f.apply(a, b)}")
    }
}