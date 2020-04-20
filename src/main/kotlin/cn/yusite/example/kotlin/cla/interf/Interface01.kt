package cn.yusite.example.kotlin.cla.interf

/**
 *
 * @author shijie
 */
interface MyInterface {
    val prop: Int
    fun test()
    fun test01() {

        println("MyInterface method")
        println(prop)
    }
}

class Child : MyInterface {
    override val prop: Int
        get() = 1

    override fun test() {

        println("child test method")
    }

    override fun test01() {

        super.test01()
        println("child test01 method")
    }
}

fun main() {

    var child = Child()
    child.let {
        it.test()
        it.test01()
    }
}