package com.tuaier.structure.list;

/**
 * @author kangfw5
 * @since 2020-03-21
 */
public class MyList {
    private Node head;
    private Node last;
    private int size;

    public void insert(int data, int index) {
        if (index<0 || index > size) {
            throw new IndexOutOfBoundsException("超出链表实际长度");
        }
        Node insertNode = new Node(data);
        if (size == 0) {
            head = insertNode;
            last = insertNode;
        } else if (index == 0) {
            insertNode.next = head;
            head = insertNode;
        } else if (size == index) {
            last.next = insertNode;
            last = insertNode;
        } else {
            Node prevNode = get(index-1);
            insertNode.next = prevNode.next;
            prevNode.next = insertNode;
        }
        size++;
    }

    public Node remove(int index) {
        if (index<0 || index > size) {
            throw new IndexOutOfBoundsException("超出链表实际长度");
        }
        Node removeNode = null;
        if (index == 0) {
            removeNode = head;
            head = head.next;
        } else if (index == size-1) {
            Node prevNode = get(index -1);
            removeNode = prevNode.next;
            prevNode.next = null;
            last = prevNode;
        } else {
            Node prevNode = get(index -1);
            Node nextNode = prevNode.next.next;
            removeNode = prevNode.next;
            prevNode.next = nextNode;
        }
        size--;
        return removeNode;
    }

    private Node get(int index) {
        if (index<0 || index > size) {
            throw new IndexOutOfBoundsException("超出链表实际长度");
        }
        Node temp = head;
        for (int i=0; i<index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void output() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        MyList m = new MyList();
        m.insert(0, 0);
        m.insert(1, 1);
        m.insert(2, 2);
        m.insert(3, 3);
        m.remove(2);
        m.output();

    }
}
