package com.jmf.kmmsamples.androidApp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.jmf.kmmsamples.shared.PlatformUtils
import com.jmf.kmmsamples.shared.Validator

class MainActivity : AppCompatActivity() {

    private val greeting by lazy { PlatformUtils().getPlatformName() }
    private val validator = Validator()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val greetingTextView: TextView = findViewById(R.id.greetingTextView)
        val phoneTextView: EditText = findViewById(R.id.editTextPhone)
        val emailTextView: EditText = findViewById(R.id.editTextEmail)
        val validateButton: Button = findViewById(R.id.validateButton)

        greetingTextView.text = getString(R.string.signUpGreeting, greeting)
        validateButton.setOnClickListener {
            val email = emailTextView.text.toString()
            val phone = phoneTextView.text.toString()

            val isValid = validator.validateEmailAddress(email) && validator.validatePhoneNumber(phone)
            val message = if (isValid) getString(R.string.validForm) else getString(R.string.notValidForm)
            Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        }
    }
}
