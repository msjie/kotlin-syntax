package cn.yusite.example.kotlin.`class`.data

private data class Person(var name: String, var age: Int?)

fun main() {

    var person = Person("shijie",null)
    println(person.name)
    println(person.age?.toLong())
    var copy = person.copy(name = "yh")
    person.name="abc"
    println(copy.name)
    println(person.name)

    val (cName,cAge) = person
    println(cName)
    println(cAge)
}
