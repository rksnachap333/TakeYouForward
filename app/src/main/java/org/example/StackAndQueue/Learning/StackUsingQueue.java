package org.example.StackAndQueue.Learning;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue implements StackMethod<Integer> {

    Queue<Integer> queue = new LinkedList<>();

    @Override
    public int push(Integer data) {

        int size = queue.size();
        boolean isAdded = queue.offer(data);
        if (isAdded) {
            for (int i = 1; i < size; i++) {
                queue.offer(queue.peek());
                queue.poll();
            }
            return queue.size();
        } else
            return -1;
    }

    @Override
    public Integer pop() {
        if (queue.size() > 0)
            return queue.poll();

        return -1;
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public int top() {
        if (queue.size() > 0)
            return queue.peek();

        return -1;
    }

}
