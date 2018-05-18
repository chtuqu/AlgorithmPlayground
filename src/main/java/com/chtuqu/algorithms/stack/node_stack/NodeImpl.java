package com.chtuqu.algorithms.stack.node_stack;

public class NodeImpl<T> implements Node<T> {

    private T value;
    private Node<T> nextNode;

    @Override
    public T getValue() {
        return value;
    }

    @Override
    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public Node<T> getNext() {
        return nextNode;
    }

    @Override
    public void setNext(Node<T> next) {
        this.nextNode = next;
    }

}
