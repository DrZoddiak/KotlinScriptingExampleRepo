plugins {
    kotlin("jvm") version "2.0.20"
}

repositories {
    mavenCentral()
}

//Should be the only thing that might need changing
val runtimeVersion = "0.2.0"

dependencies {
    //todo: Replace this with a repo
    implementation(files("libs/script-runtime-$runtimeVersion.jar"))
}

kotlin {
    jvmToolchain(21)
}