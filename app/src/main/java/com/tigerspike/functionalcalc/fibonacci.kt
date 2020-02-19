package com.tigerspike.functionalcalc

fun naiveFibonacci(value: Int): Int = when (value) {
    0 -> 0
    1 -> 1
    else -> naiveFibonacci(value - 1) + naiveFibonacci(value - 2)
}
