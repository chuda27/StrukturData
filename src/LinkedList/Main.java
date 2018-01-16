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
public class Main {
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        Node node = dll.addAtStart(2);
        dll.addAtStart(4);
        dll.addAtEnd(6);
        dll.addAtStart(7);
        dll.addAtEnd(90);
        dll.addAfter(5, node);
        dll.print();
    }
    
}
