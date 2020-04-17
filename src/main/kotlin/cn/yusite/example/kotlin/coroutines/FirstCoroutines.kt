package cn.yusite.example.kotlin.coroutines

import kotlinx.coroutines.*

fun main(args: Array<String>) {
    GlobalScope.launch { // launch a new coroutine in background and continue
        println(this)
        delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
        println("World!") // print after delay
    }
    println("Hello,") // main thread continues while coroutine is delayed
    println("block begin")
    runBlocking {
        delay(2000L)
    }
    println("block after")
    Thread.sleep(2000L) // block main thread for 2 seconds to keep JVM alive
}