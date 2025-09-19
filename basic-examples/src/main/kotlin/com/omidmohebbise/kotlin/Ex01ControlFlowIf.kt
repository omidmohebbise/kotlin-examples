package com.omidmohebbise.kotlin

import kotlin.random.Random


/*
 Control flow: if
 */
fun main() {
    val temperature: Int = Random.nextInt(50);

    val isAirConditionOn: Boolean = if (temperature > 25) {
        println("air conditioner must be on")
        true
    } else {
        println("air conditioner must be off")
        false
    }

    println(isAirConditionOn)


}