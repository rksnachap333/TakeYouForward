package org.example.StackAndQueue.Learning;

public class StackUsingArray implements StackMethod<Integer> {

    int top = -1;
    int[] stack = new int[10];

    @Override
    public int push(Integer data) {
        if (top < 9) {
            stack[++top] = (int) data;
            return top;
        }
        throw new UnsupportedOperationException("Stack is Full");
    }

    @Override
    public Integer pop() {
        if (top == -1)
            throw new UnsupportedOperationException("Stack is Empty");

        return stack[top--];
    }

    @Override
    public int size() {
        return top + 1;
    }

    @Override
    public int top() {
        if (top != -1)
            return stack[top];

        throw new UnsupportedOperationException("Stack is Empty");
    }

}
