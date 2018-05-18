package com.chtuqu.algorithms.union_find;

public class UnionFind {

    /**
     * The array to maintain connections between nodes.
     * The value for a given node represents its parent.
     */
    private int[] id;

    /**
     * The array to maintain the size of the trees.
     * The value for a given root represents the size of the tree.
     */
    private int[] size;

    /**
     * Initializes the data structure including the corresponding size array.
     * @param n the number of elements, should be positive integer
     */
    public UnionFind(int n) {
        validatePositiveInput(n);

        id = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
            size[i] = 1;
        }
    }

    /**
     * Connects the two elements.
     * This implementation connects the root of the smaller tree to the root of the larger tree.
     * The purpose is to avoid tall trees and have a balanced graph.
     * @param a the ID of the first element, should be positive integer
     * @param b the ID of the second element, should be positive integer
     */
    public void connect(int a, int b) {
        validatePositiveInput(a, b);

        // Adjusting to 0-based index
        a--;
        b--;

        int rootA = findRoot(a);
        int rootB = findRoot(b);

        if (rootA == rootB) {
            return;
        }

        if (size[rootA] <= size[rootB]) {
            id[rootA] = rootB;
            size[rootB] += size[rootA];
        } else {
            id[rootB] = rootA;
            size[rootA] += size[rootB];
        }
    }

    /**
     * Checks whether two elements are connected.
     * @param a the ID of the first element to check, should be positive integer
     * @param b the ID of the second element to check, should be positive integer
     */
    public boolean query(int a, int b) {
        validatePositiveInput(a, b);

        // Adjusting to 0-based index
        a--;
        b--;

        return findRoot(a) == findRoot(b);
    }

    /**
     * Finds the root of the tree.
     * Please note that this is not a side-effect free function.
     * While climbing, it attempts to halve the tree size to facilitate
     * future calls to both {@link #query(int, int)} and {@link #connect(int, int)} operations.
     * @param i the ID of the element to find root for
     * @return the ID of the root element
     */
    private int findRoot(int i) {
        while (id[i] != i) {
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }

    private void validatePositiveInput(int... input) {
        for (int i : input) {
            if (i <= 0) {
                throw new IllegalArgumentException("The input should consist of positive integers.");
            }
        }
    }

}