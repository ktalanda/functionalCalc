package com.tigerspike.functionalcalc

fun naiveFactorial(n: Long): Long = when (n) {
    1L -> 1L
    else -> naiveFactorial(n - 1) * n
}

tailrec fun tailrecFactorial(n: Long, acum: Long = 1): Long = when (n) {
    1L -> acum
    else -> tailrecFactorial(n - 1, acum * n)
}