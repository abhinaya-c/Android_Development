package com.example.kotlinbasics.Day3

fun main (){

    var computerChoice = ""
    var playerChoice = ""
    println("Please Enter Your Choice among : Rock, Paper, Scissors")

    playerChoice = readln()

    println("Player's Choice : $playerChoice")

    var randomNumber = (1..3).random()

    when (randomNumber){
        1 -> computerChoice = "Rock"
        2 -> computerChoice = "Paper"
        3 -> computerChoice = "Scissors"
    }

    println("Computer's Choice : $computerChoice")

    var winner = when {
        playerChoice == computerChoice -> "Tie"
        playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
        playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
        playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
        else -> "Computer"
    }

    if ( winner == "Tie")
        println("There is a tie. Nobody Won it!")
    else if ( winner == "Player")
        println("You Won the game.")
    else
        println("Sorry! You lost it.")

}

