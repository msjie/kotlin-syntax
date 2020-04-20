package cn.yusite.example.kotlin.cla.interf

/**
 *
 * @author shijie
 */
interface Named {
    val name: String
}

interface Person : Named {
    val firstName: String
    val lastName: String
    override val name: String
        get() = "$firstName&$lastName"
}

data class Employee(
        override val firstName: String,
        override val lastName: String
) : Person

fun main() {

    var employee = Employee("mao","sjie")
    println(employee.name)
}