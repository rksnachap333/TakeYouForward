package org.example.StackAndQueue.Learning;


public class QueUsingArray implements StackMethod<Integer> {
    int start = -1;
    int end = -1;
    int currentSize = 0;
    int size = 10;

    int[] queue = new int[10];

    @Override
    public int push(Integer data) {
        if (currentSize == size) {
            throw new UnsupportedOperationException("Queue is Full!!");
        } else if (currentSize == 0) {
            start = 0;
            end = 0;
            queue[start] = data;
            currentSize++;
            return start;
        } else {
            end = (end + 1) % size;
            queue[++end] = data;
            return end;

        }

    }

    @Override
    public Integer pop() {
        if (currentSize == 0) {
            throw new UnsupportedOperationException("Queue is Empty!!");
        }

        int data = queue[start];
        if (currentSize == 1) {

            start = -1;
            end = -1;
        } else {
            start = (start + 1) % size;
            currentSize -= 1;
        }

        return data;
    }

    @Override
    public int size() {
        return currentSize;
    }

    @Override
    public int top() {
        if (start != -1) {
            throw new UnsupportedOperationException("Queue is Empty!!");
        }

        return queue[start];
    }

}
