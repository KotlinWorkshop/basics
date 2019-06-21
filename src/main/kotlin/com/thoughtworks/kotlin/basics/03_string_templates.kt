package com.thoughtworks.kotlin.basics

//Print whether number is even or odd, use if expressions within a string literal

fun main(args: Array<String>) {
    val x = 4
    println("$x is ${if (x % 2 == 0) "Even" else "Odd"}")
}