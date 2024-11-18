package com.omidmohebbise.kotlin

import com.omidmohebbise.javakotlin.PersonJ

class Example04(val name: String, val age: Int) {
    var family: String = ""
    var id: Int = 0;
    var person : PersonJ

    companion object {
        var counter: Int = 0
    }

    constructor(name: String, age: Int, family: String) : this(name, age) {
        this.family = family
    }

    init {
        id = ++counter
        person = PersonJ(name, family , age)
        println(person)

    }

    override fun toString(): String {
        return "$id)  $name \t$age \t$family"
    }
}


fun main() {
    var person1: Example04 = Example04("Sara", 20)
    var person2: Example04 = Example04("Ahmad", 22, "Mohebbi")
//    println(person1)
//    println(person2)
}
