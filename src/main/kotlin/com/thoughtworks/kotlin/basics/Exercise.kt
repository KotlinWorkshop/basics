package com.thoughtworks.kotlin.basics

fun `when`(obj: Any = "Test"): String =
    when (obj) {
        1 -> "One"
        10,20,30..Int.MAX_VALUE -> "Multiple of Ten"
        "Test" -> "String is Kotlin, upper case is KOTLIN"
        is String -> {
            "String is $obj, upper case is ${obj.toUpperCase()}"
        }
        is List<*> -> "List length is ${obj.size}"
        else -> "Something else"
    }

