/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author aishw
 */
    public class StackOfInt {

    private int[] elements;
    private int size;

    /** Construct a stack with the default capacity 16 */
    public StackOfInt() {
        this(16);
    }

    /** Construct a stack with the specified maximum capacity */
    public StackOfInt(int capacity) {
        elements = new int[capacity];
    }

    /** Push a new integer into the top of the stack */
    public int push(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }

        return elements[size++] = value;
    }

    /** Return and remove the top element from the stack */
    public int pop() {
        return elements[--size];
    }

    /** Return the top element from the stack */
    public int peek() {
        return elements[size - 1];
    }

    /** Exercise03_21 whether the stack is empty */
    public boolean empty() {
        return size == 0;
    }

    /** Return the number of elements in the stack */
    public int getSize() {
        return size;
    }
}
    

