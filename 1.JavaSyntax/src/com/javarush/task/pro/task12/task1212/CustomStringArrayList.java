package com.javarush.task.pro.task12.task1212;

/* 
Создаем свой список
*/

public class CustomStringArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
        //напишите тут ваш код
        int capacity = this.capacity + this.capacity / 2;
        String[] elements = new String[capacity];
        for (int i = 0; i < this.elements.length ; i++) {
            elements[i] = this.elements[i];
        }
        this.capacity = capacity;
        this.elements = elements;
    }

}
