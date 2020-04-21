package cn.yusite.example.kotlin.`class`.objexp

class DataProvider {

}


object DataProviderManager {
    fun registerDataProvider(provider: DataProvider) {

        println(allDataProviders.add(provider))
    }
    val allDataProviders: MutableCollection<DataProvider> =  mutableListOf()
}

fun main() {

    println(DataProviderManager.allDataProviders.size)
    DataProviderManager.registerDataProvider(DataProvider())
    println(DataProviderManager.allDataProviders.size)
}