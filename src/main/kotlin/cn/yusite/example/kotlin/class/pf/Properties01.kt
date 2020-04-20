package cn.yusite.example.kotlin.`class`.pf

class Address {
    var name: String = "Holmes, Sherlock"
    var street: String = "Baker"
    var city: String = "London"
    var state: String? = null
    var zip: String = "123456"
}

fun copyAddress(address: Address): Address {
    val result = Address() // there's no 'new' keyword in Kotlin
    result.name = address.name // accessors are called
    result.street = "copy ${address.street}"
// ...
    return result
}

fun main() {

    var address = Address()
    println(address.name)
    println(address.city)
    var copyAddress = copyAddress(address)
    println(copyAddress.street)
}
