

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
	    
	    public void deleteMiddle() {
	        if (head == null || head.next == null) {
	            return; 
	        }
	        
	        Node slowPtr = head;
	        Node fastPtr = head;
	        Node prev = null;
	        
	        while (fastPtr != null && fastPtr.next != null) {
	            fastPtr = fastPtr.next.next;
	            prev = slowPtr;
	            slowPtr = slowPtr.next;
	        }
	        
	      
	        prev.next = slowPtr.next;
	    }
	    
	    public void display() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }
	}

	public class LinkedList_Q1 {
	    public static void main(String[] args) {
	        LinkedList list = new LinkedList();
	        
	      
	        list.head = new Node(1);
	        list.head.next = new Node(2);
	        list.head.next.next = new Node(3);
	        list.head.next.next.next = new Node(4);
	        list.head.next.next.next.next = new Node(5);
	        
	        System.out.print("Original linked list: ");
	        list.display();
	        
	      
	        list.deleteMiddle();
	        
	        System.out.print("Modified linked list: ");
	        list.display();
	    }
	}

