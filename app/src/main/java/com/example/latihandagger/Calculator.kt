package com.example.latihandagger

import javax.inject.Inject

class Calculator @Inject constructor() {
    fun sum(first:Int, second:Int) = first + second
}