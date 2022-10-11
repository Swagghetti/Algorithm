package assignment1;

// Java implementation of the approach
// Node structure containing data
// and pointer to the next Node
class node {

    int key;
    node next;

    node(int n) {
        key = n;
        next = null;
    }
};

// Linked list class
public class LinkedList2 {

    static node head;
    

    // Default constructor for
    // creating empty list
    public LinkedList2() {
        // Empty List
        head = null;

    }

    // Function to insert a node at the
    // head of the linked list
    void insert(node n) {

        // Empty List
        if (head == null) {
            head = n;
        } // Insert in the beginning of the list
        else {
            n.next = head;
           head = n;
        }

    }

    // function to create and return a Node
    static node GetNode(int data) {
        return new node(data);
    }

    static node InsertAtIndex(node headNode, int index, int data) {
        node head = headNode;
        if (index < 1) {
            System.out.print("Invalid position");
        }

        // if position is 1 then new node is
        // set infornt of head node
        // head node is changing.
        if (index == 1) {
            node newNode = new node(data);
            newNode.next = headNode;
            head = newNode;
        } else {
            while (index-- != 0) {
                if (index == 1) {
                    // adding Node at required position
                    node newNode = GetNode(data);

                    // Making the new Node to point to
                    // the old Node at the same position
                    newNode.next = headNode.next;

                    // Replacing current with new Node
                    // to the old Node to point to the new Node
                    headNode.next = newNode;
                    break;
                }
                headNode = headNode.next;
            }
            if (index != 1) {
                System.out.print("Position out of range");
            }
        }
        return head;
    }

    // Function to print the any index in Linked list
    long printAtIndex(int index) {
        
        int ptr = 0;
        node tmpNode = head;
        while(ptr <= index){
            
            if (ptr == index) {
                
                return tmpNode.key;
            } else {
                tmpNode = tmpNode.next;
                
            }
            
            ptr++;
        }
        return tmpNode.key;
        /*
        node ptr = head;
        while (ptr != null) {
            if (ptr.key == index) {
                
                return ptr.key;
            } else {
                ptr = ptr.next;
                
            }
            
           
            
        }
        return ptr.key;
*/ 
        
    }

    // Function to print the linked list
    void printList() {
        node ptr = head;

        while (ptr != null) {
            System.out.print(ptr.key + "->");
            ptr = ptr.next;
        }
        System.out.print("null" + "\n");
    }

    // Function to add a digit to the integer
    // represented as a linked list
    void addDigit(int n) {

        // To keep track of the last node
        // whose value is less than 9
        node lastNode = null;
        node curr = head;

        while (curr.next != null) {

            // If found a node with value
            // less than 9
            if (curr.key < 9) {
                lastNode = curr;
            }

            // Otherwise keep traversing
            // the list till end
            curr = curr.next;
        }

        // Add the given digit to the last node
        curr.key = curr.key + n;

        // In case of overflow in the last node
        if (curr.key > 9) {
            curr.key = curr.key % 10;

            // If the list is of the
            // form 9.9.9....
            if (lastNode == null) {

                // Insert a node at the beginning as
                // there would be overflow in the
                // head in this case
                insert(new node(1));

                // Adjust the lastNode pointer to
                // propagate the carry effect to
                // all the nodes of the list
                lastNode = head.next;
            }

            // Forward propagate carry effect
            while (lastNode != curr) {
                lastNode.key = (lastNode.key + 1) % 10;
                lastNode = lastNode.next;
            }
        }
    }
}

// This code is contributed by Rajput-Ji
