package com.thoughtworks.kotlin.basics

//Illustrate differences between val and var by summing up numbers


fun main(args: Array<String>) {
    var sum = sumNumbers(arrayOf(1, 2, 3, 4, 5))
    println(sum)
}

private fun sumNumbers(numbers: Array<Int>): Int {
    var sum = 0
    for (i in numbers)
        sum += i
    return sum
}