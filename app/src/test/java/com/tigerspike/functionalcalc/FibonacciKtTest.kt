package com.tigerspike.functionalcalc

import org.junit.Assert.*
import org.junit.Test

class FibonacciKtTest {
    @Test
    fun `when naiveFibonacci`() {
        assertEquals(
            "Given 0, then return 0",
            0,
            naiveFibonacci(0)
        )
        assertEquals(
            "Given 1, then return 1",
            1,
            naiveFibonacci(1)
        )
        assertEquals(
            "Given 2, then return 3",
            1,
            naiveFibonacci(2)
        )
        assertEquals(
            "Given 3, then return 5",
            2,
            naiveFibonacci(3)
        )
        assertEquals(
            "Given 3, then return 5",
            3,
            naiveFibonacci(4)
        )
        assertEquals(
            "Given 3, then return 5",
            5,
            naiveFibonacci(5)
        )
        assertEquals(
            "Given 3, then return 5",
            5,
            naiveFibonacci(6)
        )
    }
}
