package com.example.kotlintest

object Validator {
//    https://www.youtube.com/watch?v=rM25aJ0o3Us
    fun validateInput(amount: Int , desc: String):Boolean{
       return !(amount<=0 || desc.isEmpty())
    }
}