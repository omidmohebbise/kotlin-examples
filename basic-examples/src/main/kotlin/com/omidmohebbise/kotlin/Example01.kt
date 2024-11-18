package org.example.com.omidmohebbise.kotlin


/*
 Control flow: if
 */
fun main() {
   var tempreture : Int = 28;
    var isAirConditionOn: Boolean = if( tempreture > 25){
        println("air conditioner must be on")
        true
    }else{
        println("air conditioner must be off")
        false
    }

    println(isAirConditionOn)



}