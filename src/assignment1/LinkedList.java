/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment1;

/**
 *
 * @author ucarr
 */
public class LinkedList {
    
   Node head; // head of list 
   
    // Linked list Node. 
    static class Node { 
   
        int data; 
        Node next; 
   
        // Constructor 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
   
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        Node newHead = new Node(data);

        if (list.head == null){
            //list is empty
            list.head = newHead;

        }
        else{
            //list is full
            //Make next of new Node as head 
            newHead.next = list.head;
            //Move the head to point to new Node
            list.head = newHead;            
        }
        //return the list with head
        return list;
    } 
   
    //This function is in LinkedList class. Inserts a new Node at front of the list.
    public static LinkedList insertAtHead(LinkedList list, int data)
    {
        //Allocate the Node & Put in the data
        Node newNode = new Node(data);
 
        //Make next of new Node as head 
        newNode.next = list.head;
 
        //Move the head to point to new Node
        list.head = newNode;
        
        return list;
    }
    
    
    public static LinkedList InsertAtPos(LinkedList list, int position, int data) {
        
        Node head = list.head;
        Node newNode= new Node(data);
        
        if (position == 0)
            insertAtHead(list,data);
        
        else {
            
            Node temp = list.head;

            for(int i=1; i < position; i++) {
                if(temp.next != null) {
                    temp = temp.next;
                }
            }
            newNode.next = temp.next;
            temp.next = newNode;
            
        }
        return list;
    }
    
    public static Node readAtPos(LinkedList list, int position) {
        
        Node head = list.head;
        Node newNode = null;
        
        if (position == 0){
            
            newNode = list.head;
            //System.out.println(newNode.data);
            return newNode;
        }
        else {
         
            Node temp = list.head;

            for(int i=1; i < position; i++) {
                if(temp.next != null) {
                    temp = temp.next;
                }
            }
            return temp.next;          
        }
    }
    
        // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    { 
        Node currNode = list.head; 
    
        System.out.print("\nLinkedList: "); 
    
        // Traverse through the LinkedList 
        while (currNode != null) { 
            // Print the data at current node 
            System.out.print(currNode.data + " "); 
    
            // Go to next node 
            currNode = currNode.next; 
        } 
    } 
    
    
}
