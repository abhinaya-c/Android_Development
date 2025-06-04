package com.example.kotlinbasics.Day2

// Day - 2


data class CoffeeDetails (
    val sugarCount: Int,
    val coffeeFor : String,
    val creamCount : Int,
    val size : String)

fun main () {
    val coffeeForAbhinaya = CoffeeDetails (1 , "Abhinaya" , 0 , "XXl")
    makeCoffee(coffeeForAbhinaya)

}

// coffee details
fun askCoffeeDetails (){
    println("Who is the coffee for ?")
    val coffeeFor = readln()
    println("How many spoon of sugar do you prefer?")
    val sugarCount = readln().toInt()
//    makeCoffee(sugarCount , coffeeFor)
}

// Make own function called makeCoffee

fun makeCoffee (coffeeDetails : CoffeeDetails){
    if (coffeeDetails.sugarCount == 1 )
        println("Making coffee with ${coffeeDetails.sugarCount} spoon of sugar for ${coffeeDetails.coffeeFor}.")
    else if (coffeeDetails.sugarCount == 0)
        println("Making coffee with no sugar for ${coffeeDetails.coffeeFor}.")
    else
        println("Making coffee with ${coffeeDetails.sugarCount} spoons of sugar for ${coffeeDetails.coffeeFor}.")
}