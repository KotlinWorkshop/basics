package com.thoughtworks.kotlin.basics

//Taste of Kotlin, a list of people (with nullable age) and find the eldest


fun main(args: Array<String>) {

    val people = listOf(Person("Alice", 45),
            Person("Bob"))

    val eldest = people.maxBy { it.age ?: 0 }

    println("Eldest is $eldest")
}


data class Person(val name: String, val age: Int? = null)
