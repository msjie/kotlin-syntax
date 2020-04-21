package cn.yusite.example.kotlin.col


fun List<String>.getShortWordsTo(shortWords: MutableList<String>, maxLength: Int): MutableList<String>  {
    this.filterTo(shortWords) { it.length <= maxLength }
// throwing away the articles
    val articles = setOf("a", "A", "an", "An", "the", "The")
    shortWords -= articles
    return shortWords
}


fun List<String>.getShortWordsTo1(shortWords: MutableList<String>, maxLength: Int) {
    this.filterTo(shortWords) { it.length <= maxLength }
// throwing away the articles
    val articles = setOf("a", "A", "an", "An", "the", "The")
    shortWords -= articles
}

fun main() {
    val words = "A long time ago in a galaxy far far away".split(" ")
    val shortWords = mutableListOf<String>()
    words.getShortWordsTo(shortWords, 3)
    println(shortWords)
}