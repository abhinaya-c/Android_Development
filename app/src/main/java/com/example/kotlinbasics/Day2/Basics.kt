package com.example.kotlinbasics.Day2

fun main(){

    // DAY : 2


    println("Hello World!!")

    //Val and Var

    //  Val is a keyword to declare a variable whose value cannot be changed.
    val companyName : String = "Google"

//    companyName = "microsoft"  // Error: Val cannot be reassigned.

    println(companyName)

    //Var is a keyword to declare a variable whose value can be changed.

    var userAge : Int = 25
    userAge = 26
    println(userAge)

    //DATATYPES
    //Byte, Short, Int, Long, Float, Double, Boolean, Char, String

    // Basically, IDE itself determines the type of the data type.
    //NOTE: We cannot store a value of one type in a variable of another type.

    // Defining the type of the variable is optional.
    var myAge : Byte = 18 // Here, IDE is giving suggestion that, we can use the keyword "Val" instead of "Var". As, myAge is not going to change.
    println("My age cannot be that too long. So, we can store it in a variable of type Byte.")
    println("Therefore, My age is $myAge ")

    // var pi = 3.14 // firstly here, Pi is of Double type.
    var pi = 3.14f
    // We should explicity write 'f' in the value to make it type of the floating.


    println("The value of pi is $pi")

    pi = 3.1415926535f // --> Here, IDE shows some colorful line in the value; Its because floating type cannot go that precise.
    // And also if we print it cut off the value and round it up!
    // ---> It gives the output as: 3.1415927 (In Floating type)
    // ---> It give the output as : 3.141592653 (In Double type)

    // So, To get the precise value we need to use the double type instead of float.

    println(pi)


    // Boolean Data Types

    val myTrue = true
    val myFalse = false

    println(myTrue || myFalse)
    println(myTrue && myFalse)
    println(!myTrue)

    // String

    val firstName = "Abhinaya"
    val lastName = "Chaurasiya"

    println(firstName + ' ' + lastName) // String Concatination




}