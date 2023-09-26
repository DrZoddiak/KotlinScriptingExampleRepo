plugins {
    kotlin("jvm") version "1.8.0"
}

group = "me.zodd"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

//Should be the only thing that might need changing
val fileName = "host-1.0-SNAPSHOT.jar"

dependencies {
    implementation(files("libs/$fileName"))
}

kotlin {
    jvmToolchain(17)
}