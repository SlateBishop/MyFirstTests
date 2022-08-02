package com.geekbrains.myfirsttests

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

const val CORRECT_EMAIL = "name@email.com"
const val CORRECT_SUBDOMAIN_EMAIL = "name@email.co.uk"
const val EMPTY_STRING = ""
const val INVALID_EMAIL_NO_TLD = "name@email"
const val INVALID_EMAIL_DOUBLE_DOT = "name@email..com"
const val INVALID_EMAIL_NO_USERNAME = "@email.com"
const val INVALID_EMAIL_NO_DOMAIN = "name@.com"
const val INVALID_EMAIL_NOT_MAIL = "nameemail.com"


class EmailValidatorTest {

    @Test
    fun emailValidator_CorrectEmailSimple_ReturnsTrue() {
        assertTrue(EmailValidator.isValidEmail(CORRECT_EMAIL))
    }

    @Test
    fun emailValidator_CorrectEmailSubDomain_ReturnsTrue() {
        assertTrue(EmailValidator.isValidEmail(CORRECT_SUBDOMAIN_EMAIL))
    }

    @Test
    fun emailValidator_InvalidEmailNoTld_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(INVALID_EMAIL_NO_TLD))
    }

    @Test
    fun emailValidator_InvalidEmailDoubleDot_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(INVALID_EMAIL_DOUBLE_DOT))
    }

    @Test
    fun emailValidator_InvalidEmailNoUsername_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(INVALID_EMAIL_NO_USERNAME))
    }

    @Test
    fun emailValidator_EmptyString_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(EMPTY_STRING))
    }

    @Test
    fun emailValidator_NullEmail_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(null))
    }

    @Test
    fun emailValidator_NoDomain_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(INVALID_EMAIL_NO_DOMAIN))
    }

    @Test
    fun emailValidator_NotMail_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(INVALID_EMAIL_NOT_MAIL))
    }
}
