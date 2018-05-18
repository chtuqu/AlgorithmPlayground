package com.chtuqu.algorithms.stack.node_stack;

import com.chtuqu.algorithms.stack.Stack;

public class NodeStack<T> implements Stack<T> {

    private Node<T> firstNode;
    private int size;

    @Override
    public void push(T t) {
        Node<T> newNode = new NodeImpl<>();
        newNode.setValue(t);
        newNode.setNext(firstNode);
        firstNode = newNode;
        size++;
    }

    @Override
    public T pop() {
        if (size == 0) {
            throw new IllegalStateException("Stack is already empty!");
        }
        T element = firstNode.getValue();
        firstNode = firstNode.getNext();
        size--;
        return element;
    }

    @Override
    public T peek() {
        if (size == 0) {
            return null;
        }
        return firstNode.getValue();
    }

    @Override
    public int size() {
        return size;
    }
}
