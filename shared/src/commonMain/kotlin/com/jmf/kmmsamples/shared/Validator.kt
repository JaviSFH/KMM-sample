package com.jmf.kmmsamples.shared

class Validator {

    fun validatePhoneNumber(phoneNumber: String) = phoneNumber.matches(Regex("^([0-9]){9}\$"))

    fun validateEmailAddress(email: String) = email.matches(Regex("^\\S+@\\S+\$"))
}