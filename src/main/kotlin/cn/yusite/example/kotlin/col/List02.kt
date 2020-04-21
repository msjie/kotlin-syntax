package cn.yusite.example.kotlin.col

data class Person(var name: String, var age: Int)

fun main() {
//sampleStart
    val bob = Person("Bob", 31)
    val people = listOf<Person>(Person("Adam", 20), bob, bob)
    val people2 = listOf<Person>(Person("Adam", 20), Person("Bob", 31), bob)
    //相同位置具体相同的对象
    println(people == people2)
    bob.age = 32
    println(people == people2)
//sampleEnd
}