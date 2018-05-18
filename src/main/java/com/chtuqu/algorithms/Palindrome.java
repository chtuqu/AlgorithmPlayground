package com.chtuqu.algorithms;

public class Palindrome {

    public static boolean isPalindrome(String input) {
        int mid = input.length() / 2;
        for (int i = 0; i < mid; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}
