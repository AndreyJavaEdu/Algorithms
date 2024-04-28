package com.kamenskiy.io;

/*
односвязный список
 */
public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    //создаем класс, который реализовывает узел
    public class Node {
        int data; //значение
        Node next;
        public Node(int data) {}
    }

    //метод добавления
    public void add(int data){
        Node newNode = new Node(data);
        Node currentNode = head;

        if(head == null){
            head = newNode;
        }else {
            while(currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    @Override
    public String toString() {
        return "SinglyLinkedList{" +
                "head=" + head +
                '}';
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
    }
}
