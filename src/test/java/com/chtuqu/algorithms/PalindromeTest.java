package com.chtuqu.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeTest {

    @Test
    public void testIsPalindromePositive() {
        assertTrue(Palindrome.isPalindrome("rotator"));
        assertTrue(Palindrome.isPalindrome("deified"));
    }

    @Test
    public void testIsPalindromeNegative() {
        assertFalse(Palindrome.isPalindrome("autumn"));
    }

}
