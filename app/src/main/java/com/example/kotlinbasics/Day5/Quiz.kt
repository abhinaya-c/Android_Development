package com.example.kotlinbasics.Day2

fun main (){

    println("Enter two numbers to add them.")
    var num1 = readln().toInt()
    var num2 = readln().toInt()
    var sumResult = addUserInput(num1 , num2)
    println("The result of sum of two numbers is $sumResult")

    println("Enter two numbers for division.")
    val num3 = readln().toDouble()
    val num4 = readln().toDouble()

    val divideResult = divUserInput(num3 , num4)
    println("The result of division of $num3 and $num4 is $divideResult")
}

// Add Function

fun addUserInput ( num1 : Int, num2 : Int ) : Int {
    var sum  = 0
    sum = num1 + num2
    return sum
}

// Divide Function

fun divUserInput ( num3 : Double , num4 : Double ) : Double {
    val divide = num3 / num4
    return divide

}