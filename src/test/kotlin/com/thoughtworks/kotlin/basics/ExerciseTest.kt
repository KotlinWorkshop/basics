package com.thoughtworks.kotlin.basics

import org.junit.Test
import kotlin.test.assertEquals

class ExerciseTest {

    @Test
    fun `should say "One" when input is 1`() {
        assertEquals("One", `when`(1))
    }

    @Test
    fun `should say string and its upper case when a string is passed in`() {
        assertEquals("String is Foo, upper case is FOO", `when`("Foo"))
    }

    @Test
    fun `should say length of a list when a list is passed in`() {
        assertEquals("List length is 4", `when`(listOf("Alpha", "Beta", "Gamma", "Delta")))
    }

    @Test
    fun `should say "Something else" when none of the above are passed in`() {
        assertEquals("Something else", `when`(Pair(1, "A")))
    }

    @Test
    fun `when no argument is passed in explicitly, the string "Kotlin" should be considered`() {
        assertEquals("String is Kotlin, upper case is KOTLIN", `when`())
    }
}