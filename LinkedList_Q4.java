class Node {
    char data;
    Node next;
    
    public Node(char data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    
    public LinkedList() {
        this.head = null;
    }
    
    public void insert(char data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    
    public boolean isPalindrome() {
        if (head == null) {
            return false; 
        }
        
        Node slowPtr = head;
        Node fastPtr = head;
        
       
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        
        
        Node prev = null;
        Node current = slowPtr;
        Node next = null;
        
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        

        Node left = head;
        Node right = prev;
        
        while (right != null) {
            if (left.data != right.data) {
                return false; 
            }
            left = left.next;
            right = right.next;
        }
        
        return true;
    }
}

public class LinkedList_Q4 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        
        list.insert('R');
        list.insert('A');
        list.insert('D');
        list.insert('A');
        list.insert('R');
        
        
        boolean isPalindrome = list.isPalindrome();
        
        System.out.println("Is the linked list a palindrome? " + isPalindrome);
    }
}
