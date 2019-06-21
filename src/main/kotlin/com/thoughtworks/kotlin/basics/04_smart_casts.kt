package com.thoughtworks.kotlin.basics

//Illustrate length of a string, if input is string OR size of a list, if input if list

fun size(obj: Any): Int {
    return if (obj is String && obj.length < 3) obj.length
    else if (obj is List<*>) obj.size
    else 0
}

fun main(args: Array<String>) {
    println(size("I am here"))
}