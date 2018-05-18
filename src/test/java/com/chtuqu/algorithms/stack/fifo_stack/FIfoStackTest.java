package com.chtuqu.algorithms.stack.fifo_stack;

import com.chtuqu.algorithms.stack.Stack;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FIfoStackTest {

    private Stack<Integer> stack;

    @Before
    public void prepareStack() {
        stack = new FifoStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
    }

    @Test
    public void testPush() {
        stack.push(4);
        assertEquals(Integer.valueOf(1), stack.peek());
        assertEquals(4, stack.size());
    }

    @Test
    public void testPop() {
        Integer popped = stack.pop();
        assertEquals(Integer.valueOf(1), popped);
        assertEquals(Integer.valueOf(2), stack.peek());
        assertEquals(2, stack.size());
    }

    @Test
    public void testPeek() {
        assertEquals(Integer.valueOf(1), stack.peek());
        assertEquals(Integer.valueOf(1), stack.peek());
        assertEquals(3, stack.size());
    }

    @Test
    public void testSize() {
        assertEquals(3, stack.size());
    }

}
