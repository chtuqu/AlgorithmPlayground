package com.chtuqu.algorithms.stack.custom_stack;

import com.chtuqu.algorithms.stack.Stack;

import java.util.ArrayList;
import java.util.List;

public class CustomStack<T> implements Stack<T> {

    private List<T> list = new ArrayList<>();

    @Override
    public void push(T t) {
        list.add(t);
    }

    @Override
    public T pop() {
        if (list.isEmpty()) {
            throw new IllegalStateException("Stack is already empty!");
        }
        return list.remove(list.size() - 1);
    }

    @Override
    public T peek() {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    @Override
    public int size() {
        return list.size();
    }
}
