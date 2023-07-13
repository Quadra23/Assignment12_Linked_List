

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
	    
	    public void createLoop(int x) {
	        if (x == 0 || head == null) {
	            return;
	        }
	        
	        Node current = head;
	        Node loopNode = null;
	        
	        int count = 1;
	        while (current.next != null) {
	            if (count == x) {
	                loopNode = current;
	            }
	            current = current.next;
	            count++;
	        }
	        
	        if (loopNode != null) {
	            current.next = loopNode;
	        }
	    }
	    
	    public void detectAndRemoveLoop() {
	        if (head == null || head.next == null) {
	            return; 
	        }
	        
	        Node slowPtr = head;
	        Node fastPtr = head;
	        
	        
	        while (fastPtr != null && fastPtr.next != null) {
	            slowPtr = slowPtr.next;
	            fastPtr = fastPtr.next.next;
	            
	            if (slowPtr == fastPtr) {
	                break; 
	            }
	        }
	        
	        if (slowPtr != fastPtr) {
	            return;
	        }
	        
	        
	        slowPtr = head;
	        
	        while (slowPtr.next != fastPtr.next) {
	            slowPtr = slowPtr.next;
	            fastPtr = fastPtr.next;
	        }
	        
	       
	        fastPtr.next = null;
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

	public class LinkedList_Q5 {
	    public static void main(String[] args) {
	        LinkedList list = new LinkedList();
	        
	        
	        list.insert(1);
	        list.insert(3);
	        list.insert(4);
	        
	        int x = 2;
	        
	       
	        list.createLoop(x);
	        
	        System.out.print("Original linked list: ");
	        list.display();
	        
	      
	        list.detectAndRemoveLoop();
	        
	        System.out.print("Linked list after removing the loop: ");
	        list.display();
	    }
	}

