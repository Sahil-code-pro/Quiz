package com.example.hope

data class Question (
    val id : Int,
    val question : String,
    val optionOne : String,
    val optionThree : String ,
    val optionTwo : String,
    val optionFour : String,
    val correctOption : Int
)