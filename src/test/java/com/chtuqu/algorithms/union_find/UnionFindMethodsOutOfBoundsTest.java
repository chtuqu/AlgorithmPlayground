package com.chtuqu.algorithms.union_find;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UnionFindMethodsOutOfBoundsTest {

    @Parameterized.Parameters
    public static Collection<Object[]> invalidInputs() {
        return Arrays.asList(new Object[][] {{11, 5}, {4, 12}});
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

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testQueryOutOfBounds() {
        unionFind.query(a, b);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testConnectOutOfBounds() {
        unionFind.connect(a, b);
    }
}
