package com.omidmohebbise.kotlin

// reflection
class Example05(val name: String, val family: String) {
}

fun main() {
    for (property in Example05::class.members)
        println(property.name)
}