package com.tuaier.structure.array;

/**
 * @author kangfw5
 * @since 2020-03-21
 */
public class MyArray {
    int[] array;
    private int size;

    public MyArray(int capacity) {
        this.array = new int[capacity];
        size = 0;
    }

    public void insert(int element, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("超出数组实际元素范围");
        }

        if (size >= array.length) {
            resize();
        }

        for (int i = size -1; i >= index; i--) {
            array[i+1] = array[i];
        }

        array[index] = element;
        size++;
    }

    public int delete(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("超出数组实际元素范围");
        }
        int deleteElement = array[index];
        for (int i = index; i <= size; i++) {
            array[i] = array[i+1];
        }
        size--;
        return deleteElement;
    }

    private void resize() {
        int[] arrayNew = new int[array.length*2];
        System.arraycopy(array, 0, arrayNew, 0, array.length);
        array = arrayNew;
        System.out.println("扩容后大小:" + array.length);
    }

    public void output() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        MyArray a = new MyArray(4);
        a.insert(0, 0);
        a.insert(1, 1);
        a.insert(2, 2);
        a.insert(3, 3);

        a.insert(10, 1);
        a.insert(30, 3);
        a.output();
    }
}
