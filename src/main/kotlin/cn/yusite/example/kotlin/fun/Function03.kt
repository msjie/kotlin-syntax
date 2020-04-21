package cn.yusite.example.kotlin.`fun`


fun main() {

    var f1 = { str: String, ofter: String.() -> Int ->
        var invoke = ofter.invoke(str)
        println("${invoke.toString()} str")
        invoke
    }
    var f2: String.(re: Int)->String = {re ->
        println(re)
        this.repeat(re)
    }
    var f11 = f1("2", String::toInt)
    println(f11)
    println(f2.invoke("3",5))
}