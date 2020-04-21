package cn.yusite.example.kotlin.cla.interf

/**
 *
 * @author shijie
 */
interface MyInterface {
    val prop: Int
    fun test()
    fun test01(): Int {

        println("MyInterface method")
        println(prop)
        return 2
    }
}

class Child : MyInterface {
    override val prop: Int
        get() = 1

    override fun test() {

        println("child test method")
    }

    override fun test01(): Int {

        super.test01()
        println("child test01 method")
        return 1
    }
}

fun main() {

    var child = Child()

    println(child.let {
        it.test()
        it.test01()
    })
}