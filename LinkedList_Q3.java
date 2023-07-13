

	class Node {
	    int data;
	    Node next;
	    
	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	class LinkedList {
	    Node head;
	    
	    public LinkedList() {
	        this.head = null;
	    }
	    
	    public void insert(int data) {
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
	    
	    public int findNthFromEnd(int n) {
	        if (head == null) {
	            return -1; // Empty list
	        }
	        
	        Node fastPtr = head;
	        Node slowPtr = head;
	        
	       
	        for (int i = 0; i < n; i++) {
	            if (fastPtr == null) {
	                return -1; 
	            }
	            fastPtr = fastPtr.next;
	        }
	        
	       
	        while (fastPtr != null) {
	            slowPtr = slowPtr.next;
	            fastPtr = fastPtr.next;
	        }
	        
	        if (slowPtr == null) {
	            return -1; 
	        }
	        
	        return slowPtr.data;
	    }
	}

	public class LinkedList_Q3 {
	    public static void main(String[] args) {
	        LinkedList list = new LinkedList();
	        
	        
	        list.insert(1);
	        list.insert(2);
	        list.insert(3);
	        list.insert(4);
	        list.insert(5);
	        list.insert(6);
	        list.insert(7);
	        list.insert(8);
	        list.insert(9);
	        
	        int n = 2;
	        
	        
	        int nthFromEnd = list.findNthFromEnd(n);
	        
	        if (nthFromEnd == -1) {
	            System.out.println("Invalid input");
	        } else {
	            System.out.println("Nth node from the end: " + nthFromEnd);
	        }
	    }
	}

