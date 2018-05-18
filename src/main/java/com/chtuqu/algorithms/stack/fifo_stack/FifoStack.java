package com.chtuqu.algorithms.stack.fifo_stack;

import com.chtuqu.algorithms.stack.Stack;
import com.chtuqu.algorithms.stack.node_stack.NodeStack;

public class FifoStack<T> implements Stack<T> {

    private NodeStack<T> inbox = new NodeStack<>();
    private NodeStack<T> outbox = new NodeStack<>();

    @Override
    public void push(T t) {
        inbox.push(t);
    }

    @Override
    public T pop() {
        if (outbox.size() == 0) {
            while (inbox.size() != 0) {
                outbox.push(inbox.pop());
            }
        }
        return outbox.pop();
    }

    @Override
    public T peek() {
        if (outbox.size() == 0) {
            while (inbox.size() != 0) {
                outbox.push(inbox.pop());
            }
        }
        return outbox.peek();
    }

    @Override
    public int size() {
        return inbox.size() + outbox.size();
    }
}
