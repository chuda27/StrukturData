/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LinkedList;

/**
 *
 * @author choirul.huda
 */
public class DoubleLinkedList {
    Node head; //first node of double linked list
    Node tail; //last node of double linked list
    int length = 0;
    
    public Node addAtStart(int data) {
        System.out.println("Adding data "+data+" at the start");
        Node newNode = new Node(data);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        
        length++;
        return newNode;
    }
    
    public Node addAtEnd(int data) {
        System.out.println("Adding data "+data+" at the end");
        Node newNode = new Node(data);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        length++;
        return newNode;
    }
    
    public Node addAfter(int data, Node prevNode){
        if (prevNode == null) {
            System.out.println("Previous node cannot be null!");
            return null;
        } else if (prevNode == tail) { //check lass node
            return addAtEnd(data);
        } else {
            System.out.println("Adding data "+data+" after node "+prevNode.data);
            Node newNode = new Node(data);
            
            newNode.prev = prevNode;
            newNode.next = prevNode.next;
            
            prevNode.next = newNode;
            
            length++;
            return newNode;
            
        }
    }
    
    public int getLength(){
        return length;
    }
    
    public void print(){
        Node temp = head;
        System.out.println("\n===== Show Double LL =======");
        System.out.print("NULL(head)");
        while (temp != null) {
            if (temp.prev == null) 
                System.out.print(" <- ");
            else
                System.out.print(" <=> ");
            System.out.print(temp.data);
            temp = temp.next;
            if (temp == null) {
                System.out.print(" -> ");
            }
        }
        System.out.print("(tail)NULL");
        System.out.println("\nTotal of data : "+getLength());
    }
}
