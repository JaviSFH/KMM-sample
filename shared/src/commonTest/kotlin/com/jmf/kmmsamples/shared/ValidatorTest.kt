package com.jmf.kmmsamples.shared

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ValidatorTest {

    private val validator = Validator()

    @Test
    fun `GIVEN NOT valid email WHEN validator invoked THEN return false`() {
        val notValidEmail = "hello"

        val actualResult = validator.validateEmailAddress(notValidEmail)

        assertFalse(actualResult)
    }

    @Test
    fun `GIVEN valid email WHEN validator invoked THEN return true`() {
        val validEmail = "hello@friend.com"

        val actualResult = validator.validateEmailAddress(validEmail)

        assertTrue(actualResult)
    }

    @Test
    fun `GIVEN not valid phone WHEN validator invoked THEN return false`() {
        val notValidPhoneNumber = "66611223344"

        val actualResult = validator.validatePhoneNumber(notValidPhoneNumber)

        assertFalse(actualResult)
    }

    @Test
    fun `GIVEN valid phone WHEN validator invoked THEN return true`() {

        val validPhoneNumber = "666112233"

        val actualResult = validator.validatePhoneNumber(validPhoneNumber)

        assertTrue(actualResult)
    }
}