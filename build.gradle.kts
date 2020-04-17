plugins {
    kotlin("jvm") version "1.3.71"
}


repositories {
    this.maven {
        this.url = uri("https://maven.aliyun.com/repository/public/")
    }
}

dependencies {
    this.implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.5")
}
