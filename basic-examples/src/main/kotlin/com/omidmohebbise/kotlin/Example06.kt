package com.omidmohebbise.kotlin


// Sequences
fun main(args: Array<String>) {
    var numbers = generateSequence(100) { it + 2 }

    println(numbers.drop(1).take(5 ).toList())
}