package com.chtuqu.algorithms.union_find;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UnionFindTest {

    @Test
    public void testPositiveCase() {
        UnionFind unionFind = new UnionFind(10);

        assertFalse(unionFind.query(2, 5));
        assertFalse(unionFind.query(7, 3));
        unionFind.connect(7, 8);
        unionFind.connect(4, 5);
        unionFind.connect(4, 9);
        assertFalse(unionFind.query(8, 4));
        unionFind.connect(8, 9);
        assertTrue(unionFind.query(7, 5));
        unionFind.connect(2, 3);
        unionFind.connect(1, 6);
        unionFind.connect(6, 10);
        assertFalse(unionFind.query(10, 3));
        assertTrue(unionFind.query(1, 10));
    }

    @Test
    public void testArgumentOfOne() {
        UnionFind unionFind = new UnionFind(1);

        unionFind.connect(1, 1);

        assertTrue(unionFind.query(1, 1));
    }

    @Test
    public void testArgumentEqualToArraySize() {
        UnionFind unionFind = new UnionFind(10);

        unionFind.connect(10, 10);

        assertTrue(unionFind.query(10, 10));
    }

    @Test
    public void testSymmetry() {
        UnionFind unionFind = new UnionFind(10);

        unionFind.connect(4, 7);

        assertTrue(unionFind.query(4, 7));
        assertTrue(unionFind.query(7, 4));
    }

    @Test
    public void testTransitivity() {
        UnionFind unionFind = new UnionFind(10);

        unionFind.connect(3, 5);
        unionFind.connect(5, 8);

        assertTrue(unionFind.query(3, 8));
        assertTrue(unionFind.query(8, 3));
    }

    @Test
    public void testQueryMultipleInvocations() {
        UnionFind unionFind = new UnionFind(10);

        unionFind.connect(1, 9);

        assertTrue(unionFind.query(9, 1));
        assertTrue(unionFind.query(9, 1));
    }

    @Test
    public void testConnectMultipleInvocations() {
        UnionFind unionFind = new UnionFind(10);

        unionFind.connect(1, 9);
        unionFind.connect(1, 9);

        assertTrue(unionFind.query(9, 1));
    }



}
