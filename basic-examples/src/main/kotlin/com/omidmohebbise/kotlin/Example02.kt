package org.example.com.omidmohebbise.kotlin

import kotlin.random.Random
import kotlin.random.nextInt


/*
 Control flow: when
 */
fun main() {
   val dayOfWeek : Int = Random.nextInt(8);
    when(dayOfWeek){
        1 -> println("Saturday")
        2 -> println("Sunday")
        3 -> println("Monday")
        4 -> println("Tuesday")
        5 -> println("Wednesday")
        6 -> println("Thursday")
        7 -> println("Friday")
        else -> println("not valid day of week")
    }


    var risk : Int = Random.nextInt(12)

    when(risk){
        in 1..4 -> println("Low risk")
        in 5..8 -> println("Medium risk")
        in 9..10 -> println("High risk")
        else -> println("not support risk number")
    }


}