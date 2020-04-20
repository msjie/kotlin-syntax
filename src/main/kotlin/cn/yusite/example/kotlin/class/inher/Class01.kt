package cn.yusite.example.kotlin.`class`.inher

private class Empty

//primary constructor
private class Person constructor(var firstName: String, lastName: String = "m") {

    private val firstProperty = "First property: $firstName".also (::println )

    //initial block
    init {
        println("init block : $firstName")
        firstName = firstName.repeat(2)
    }

    override fun toString(): String {
        return "$firstProperty"
    }

    val secondProperty = "Second property: ${firstName.length}".also(::println)

    init {
        println("Second initializer block that prints ${firstName.length}")
//        lastName = lastName.repeat(2)
    }
}

fun main() {

    println("main method")
    var p = Person(firstName = "test")
}