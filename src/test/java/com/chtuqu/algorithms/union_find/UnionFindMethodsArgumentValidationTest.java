package com.chtuqu.algorithms.union_find;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UnionFindMethodsArgumentValidationTest {

    @Parameterized.Parameters
    public static Collection<Object[]> invalidInputs() {
        return Arrays.asList(new Object[][] {
                {0, 0}, {0, -1}, {0, 1},
                {-1, 0}, {-1, -1}, {-1, 1},
                {1, 0}, {1, -1}
        });
    }

    @Parameterized.Parameter(0)
    public int a;

    @Parameterized.Parameter(1)
    public int b;

    private UnionFind unionFind;

    @Before
    public void init() {
        unionFind = new UnionFind(10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testQueryWithInvalidInputs() {
        unionFind.query(a, b);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConnectWithInvalidInputs() {
        unionFind.connect(a, b);
    }
}
