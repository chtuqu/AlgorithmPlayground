package com.chtuqu.algorithms.stack;

public interface Stack<T> {

    /**
     * Pushes element to the stack
     * @param t element
     */
    void push(T t);

    /**
     * Pops element from the top of the stack
     * @return popped element
     */
    T pop();

    /**
     * Peeks at the top of the stack
     * @return peeked element
     */
    T peek();

    /**
     * Gets the size of the stack
     * @return size of the stack
     */
    int size();

}
