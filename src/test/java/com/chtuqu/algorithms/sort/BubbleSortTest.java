package com.chtuqu.algorithms.sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {
    @Test
    public void testSort() {
        int[] actualArray = { 6, 4, 9, 5 };
        int[] expectedArray = { 4, 5, 6, 9 };

        BubbleSort.sort(actualArray);

        assertArrayEquals(expectedArray, actualArray);
    }
}
