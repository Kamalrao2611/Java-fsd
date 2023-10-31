package com.singlylinkedlist;


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head;

    SinglyLinkedList() {
        head = null;
    }

    // Add a new node to the end of the list
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Display the elements in the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}



public class SinglyLinkedListImp {
	
	    public static void main(String[] args) {
	        SinglyLinkedList list = new SinglyLinkedList();

	        list.append(10);
	        list.append(20);
	        list.append(30);
	        list.append(40);
	        list.append(50);

	        System.out.println("Linked List: ");
	        list.display();
	    }

}