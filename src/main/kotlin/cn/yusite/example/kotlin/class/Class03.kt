package cn.yusite.example.kotlin.`class`


class Constructors {

    //init block作为主构造函数的一部分
    init {
        println("Init block")
    }

    //次构造隐式委托主构造函数
    constructor(i: Int) {
        println("Constructor")
    }
}
//sampleEnd
fun main() {
    Constructors(1)
}