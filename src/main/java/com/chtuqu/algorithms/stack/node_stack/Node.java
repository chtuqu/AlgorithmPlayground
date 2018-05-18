package com.chtuqu.algorithms.stack.node_stack;

public interface Node<T> {
    T getValue();
    void setValue(T t);

    Node<T> getNext();
    void setNext(Node<T> t);
}
