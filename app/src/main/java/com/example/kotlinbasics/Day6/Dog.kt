package com.example.kotlinbasics.Day6

class Dog (var name : String , val breed : String , var age : Int = 1 ) {

    init {
        bark(name)
    }

    fun bark(name : String){
        println("$name says Woof! Woof!")
    }
}