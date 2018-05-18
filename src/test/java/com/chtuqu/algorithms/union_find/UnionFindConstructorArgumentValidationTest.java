package com.chtuqu.algorithms.union_find;

import org.junit.Test;

public class UnionFindConstructorArgumentValidationTest {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNegativeArgument() {
        int numberOfElements = -1;

        new UnionFind(numberOfElements);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithZeroArgument() {
        int numberOfElements = 0;

        new UnionFind(numberOfElements);
    }

    @Test
    public void testConstructorWithPositiveArgument() {
        int numberOfElements = 10;

        new UnionFind(numberOfElements);
    }

}
