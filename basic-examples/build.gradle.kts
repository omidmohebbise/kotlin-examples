import org.jetbrains.kotlin.ir.backend.js.compile

plugins {
    kotlin("jvm") version "1.9.21"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    runtimeOnly("org.jetbrains.kotlin:kotlin-reflect:1.9.22")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}