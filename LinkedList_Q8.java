

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
	    
	    public boolean isCircular() {
	        if (head == null) {
	            return false; 
	        }
	        
	        Node slowPtr = head;
	        Node fastPtr = head;
	        
	        
	        while (fastPtr != null && fastPtr.next != null) {
	            slowPtr = slowPtr.next;
	            fastPtr = fastPtr.next.next;
	            
	            if (slowPtr == fastPtr) {
	                return true;
	            }
	        }
	        
	        return false; 
	    }
	}

	public class LinkedList_Q8 {
	    public static void main(String[] args) {
	        LinkedList list = new LinkedList();
	        
	       
	        list.insert(1);
	        list.insert(2);
	        list.insert(3);
	        list.insert(4);
	        list.insert(5);
	        
	        
	        list.head.next.next.next.next.next = list.head;
	        
	       
	        boolean isCircular = list.isCircular();
	        
	        System.out.println("Is the linked list circular? " + isCircular);
	    }
	}

