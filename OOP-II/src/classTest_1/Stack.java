package classTest_1;

import java.util.EmptyStackException;
import java.util.Objects;

public class Stack <E> {
    private final  int size;
    private int top;
    private E[] elements;

    public Stack() {
        this(10);
    }
    public Stack(int x) {
        size = x > 0 ? x : 10;
        top = -1;

        elements = (E[]) new Object[size];
    }

    public  void push(E pushValue) {
        if(top == size-1)
            throw new FullStackException(String.format("Stack is full, cannot push %s",pushValue));

        elements[++top] = pushValue;
    }

    public E pop() {
        if(top == -1)
            throw new EmptyStackexception("Stack is empty, cannot pop");

        return  elements[top--];
    }
}


class FullStackException extends RuntimeException {
    public FullStackException() {
        this("Stack is full");
    }

    public  FullStackException(String exeception) {
        super(exeception);
    }
}

class EmptyStackexception extends RuntimeException {
    public EmptyStackexception() {
        this("Stack is empty");
    }

    public EmptyStackexception (String exception) {
        super(exception);
    }
}
