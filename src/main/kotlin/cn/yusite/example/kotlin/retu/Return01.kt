package cn.yusite.example.kotlin.retu

fun main() {

//    loop@ for (i in 1..100) {
//        println("i = $i")
//        for (j in 1..100) {
//            if (i == 2) break@loop
//            println("j = $j")
//        }
//    }
    //标签，
    for (i in 1..100) {
        println("i = $i")
        lop@ for (j in 1..100) {
            if (i == 2) break@lop
            println("j = $j")
        }
    }
}