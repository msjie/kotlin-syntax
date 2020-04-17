package cn.yusite.example.kotlin.`class`

open class Shape {
    open fun draw() { /*……*/
    }

    fun fill() { /*……*/
    }
}

class Circle() : Shape() {

    constructor(name: String) : this() {

    }

    override fun draw() { /*……*/
    }
}