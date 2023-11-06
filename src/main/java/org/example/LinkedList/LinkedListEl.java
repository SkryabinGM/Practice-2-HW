package org.example.LinkedList;

public class LinkedListEl<T> {
    private T value;
    private LinkedListEl<T> rightEl;
    private LinkedListEl<T> leftEl;

    public T getValue() {
        return value;
    }
    public LinkedListEl<T> getRightEl() {
        return rightEl;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public void setRightEl(LinkedListEl<T> rightEl) {
        this.rightEl = rightEl;
    }
    public void setLeftEl(LinkedListEl<T> leftEl) {
        this.leftEl = leftEl;
    }
    public LinkedListEl<T> getLeftEl() {
        return leftEl;
    }
    public LinkedListEl(T value) {
        this.value = value;
    }
    public LinkedListEl() {
           }
}
