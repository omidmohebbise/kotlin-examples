package org.example.com.omidmohebbise.kotlin


/*
 Loops
 */
fun main() {


  for(i in 10.rangeTo(20).step(2))
      println("index is equal: $i")

  for((index, i) in 10.rangeTo(20).step(2).withIndex()) {
      println("$index )index is equal: $i")
  }

    var tempArr = arrayOf(1,2,3,4,5)
    for(i in tempArr.indices)
        println(tempArr[i])


}