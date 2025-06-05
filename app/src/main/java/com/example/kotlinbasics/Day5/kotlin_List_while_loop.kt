package com.example.kotlinbasics.Day3

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.VANILLA_ICE_CREAM)
fun main() {

    // Immutable list -- you cannot add items after the initialization.
//    val shoppingList = listOf("Processors", "RAM", "SSD", "Graphics Card")

    // Muttable list -- you can add items later and modify
    val shoppingList = mutableListOf("Processors", "RAM" , "Graphics Card RTX 3060", "SSD")

    // Adding the items
    shoppingList.add("Cooling System")
    shoppingList.remove("Graphics Card RTX 3060")
    shoppingList.add("Graphics Card RTX 4090")

    println(shoppingList)

    // Accessing Indexing property of list
    // Let's see what is stored in index 2
    println(shoppingList[2])

    //lets see where is the graphics card stored!
    println(shoppingList.indexOf("Graphics Card RTX 4090"))

    // Modifying the list and there items

    shoppingList.add(3 , "External Hard Disk")
    println(shoppingList)

    println("Changing the graphics card for the system.")
    /* We have multiple ways to modify the list.
       -- 1. By using the index
       -- 2. By using the set method

     */
    shoppingList[5] = "Graphics Card AMD Ryzen 7000 Series"
    // Set Method
    shoppingList.set (4 , "Water Cooling System")
    println(shoppingList)

    // Contain Method

    val hasRam = shoppingList.contains("RAM")
    if (hasRam){
        println("Has RAM in the list.")
    }
    else{
        println("No RAM in the list.")
    }

    for (items in shoppingList){
        println(items)
        if ( items == "External Hard Disk"){

            shoppingList.removeLast()
            break
        }
    }

    val sizeOfList = shoppingList.size
    println("The size of the list is $sizeOfList")

    for (items in 0 until shoppingList.size){
        println("item ${shoppingList[items]} is at index $items")
    }

    println(shoppingList)

}