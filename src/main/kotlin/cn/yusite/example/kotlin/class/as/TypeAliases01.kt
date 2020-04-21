package cn.yusite.example.kotlin.`class`.`as`

typealias NodeSet = MutableSet<Int>

fun main() {

    var nodeSet: NodeSet = mutableSetOf()
    nodeSet.add(1)
    var f: (Int) -> Unit = {
        println("it value $it")
    }
    nodeSet.forEach(f)
}
