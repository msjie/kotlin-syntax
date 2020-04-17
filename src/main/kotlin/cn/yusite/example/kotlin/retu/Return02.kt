package cn.yusite.example.kotlin.retu

private fun foo() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return // non-local return directly to the caller of foo()
        println(it)
    }
    println("this point is unreachable")
}

private fun fooLable() {
    listOf(1, 2, 3, 4, 5).forEach loop@{
        if (it == 3) return@loop // non-local return directly to the caller of foo()
        println("it = $it")
    }
    println("this point is unreachable")
}

private fun fooForeach() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return@forEach // non-local return directly to the caller of foo()
        println("it = $it")
    }
    println("this point is unreachable")
}


private fun fooRun() {
    run loop@{
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return@loop // non-local return from the lambda passed to run
            println(it)
        }
    }
    print(" done with nested loop")
}

fun main() {

    foo()
    println("label=============")
    fooLable()
    println("label****************")
    fooForeach()
    println("%".repeat(10))
    fooRun()
}