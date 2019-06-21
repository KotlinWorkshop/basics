package com.thoughtworks.kotlin.basics

//Illustrate the following
//Length of nullable strings
//Null check
//Nullable form
//Elvis operator
//Non-null assertion
//Chained nullables

fun main(args: Array<String>) {
    println(lengthOfNullable("Test"))

    println(lengthOfNullable(null))

}

fun `lengthOfNullable`(s: String?): Int = s?.length ?: 0
fun lengthOfNullableEvil(s: String?): Int = s!!.length
