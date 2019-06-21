package com.thoughtworks.kotlin.basics

//Illustrate when input is either:
//1
//2 or 4
//Between 6 to 10
//is a string
//is a list (then print numbers)
//otherwise

fun `if`(obj: Any) {
    when (obj) {
        1 -> println("One")
        2, 4 -> println("Two or Four")
        6..10 -> println("Between 6 to 10")
        is String -> {
            println("A string with length ${obj.length} ")
        }
        is List<*> -> println(obj)
        else -> println("Unexpected")
    }
}

fun main(args: Array<String>) {
    `if`(1)
    `if`(4)
    `if`(7)
    `if`(6..10)
    `if`("Here")
    `if`(listOf(1, 2, 3))
    `if`(true)
}