package org.example.StackAndQueue.Learning;

public interface StackMethod<T> {

    public int push(T data); // will push the data and return the position

    public T pop();

    public int size();

    public int top();

}
