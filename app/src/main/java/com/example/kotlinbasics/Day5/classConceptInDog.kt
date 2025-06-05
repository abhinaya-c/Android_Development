package com.example.kotlinbasics.Day2

import com.example.kotlinbasics.Day5.Dog

fun main() {
    var puppy = Dog("Dardo", "pudoo")
    println("${puppy.name} is a ${puppy.breed} and is ${puppy.age} years old.")

    println("A year has passed.")
    puppy.age = 2
    println("${puppy.name} is a ${puppy.breed} and is ${puppy.age} years old.}")
}