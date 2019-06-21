package com.thoughtworks.kotlin.basics

//Illustrate default arguments with a function that gives the full name, given first and last names
//Functions, function expressions

fun fullName(firstName: String = "Bob", secondName: String = "Willis") : String{
    return "$firstName $secondName"
}


fun main(args: Array<String>) {
    println(fullName("Ryan", "Harris"))
    println(fullName(firstName = "Ryan"))
    println(fullName(secondName = "Harris"))
    println(fullName())
    println(fullName(secondName = "Harris", firstName = "ryan"))
}