package com.example.kotlinbasics.Day3

fun main() {
    //If Else loops

    var age = 0
    println("Please enter your age as a whole number.")
    age = readln().toInt()
    if (age != null) {
        if (age >= 40) {
            // If condition is true, Execute what's in here.
            println("You're old, You can go to home.")
        }
        else if(age >= 18){
            println("You're prefect for this club.")
        }
        else {
            // If condition is not true, Execute this in here.
            println("You cannot enter to club, You're under aged.")
        }
    }


    // While Loop with Counter

//    while (true){
//        // This content will be executed until the condition is true.
//    }

    var count = 0
    while (count < 3){
        println("Count is $count")
        count++
    }
    println("The loop is done!")


    println("Enter some input:")
    var userInput = readln()
    while (userInput == "1"){
        println("While loop is executed")
        break;
    }
    println("The loop is done!")
}