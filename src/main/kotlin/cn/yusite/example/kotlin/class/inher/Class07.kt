package cn.yusite.example.kotlin.`class`.inher

class MyClass(name: String) {

    val name:String = name

    /**
     * 伴生对象，内部定义的方法，相当于java的静态方法
     */
    companion object Factory123 {
        var name = "test"
        fun create123(): MyClass = MyClass(name)
        fun create(): Square {
            return Square()
        }
    }

}

class MyClass2 {
    companion object Named {
        fun create123(): MyClass2 = MyClass2()
        fun create1(): MyClass2 = MyClass2()
    }

}

fun main() {

    var create123 = MyClass.create123()
    var square = MyClass.create()
    println(create123.name)
    println(square)
    var myClass2 = MyClass2.create123()
    var myClass1 = MyClass2.create1()
    println(MyClass2.create1())
    println(myClass2)
    println(myClass1)
}