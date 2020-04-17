package cn.yusite.example.kotlin.`class`

private class Person02(name: String) {
    var children: MutableList<Person02> = mutableListOf()
    var name = name

    constructor(name: String, parentPerson02: Person02) : this(name) {
//        println(name)
        parentPerson02.children.add(this)
    }
}

fun main() {
    var p1 = Person02("p1")
    var p2 = Person02("p2", p1)
    var p3 = Person02("p3", p1)
    p1.children.forEach { println(it.name) }

}