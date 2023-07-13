

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
	    
	    public void retainDelete(int M, int N) {
	        if (head == null) {
	            return;
	        }
	        
	        Node current = head;
	        Node prev = null;
	        
	        while (current != null) {
	            int count = 0;
	            
	            
	            while (current != null && count < M) {
	                prev = current;
	                current = current.next;
	                count++;
	            }
	            
	            count = 0;
	            
	           
	            while (current != null && count < N) {
	                current = current.next;
	                count++;
	            }
	            
	           
	            prev.next = current;
	        }
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

	public class LinkedList_Q6 {
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
	        
	        int M = 2;
	        int N = 2;
	        
	        System.out.print("Original linked list: ");
	        list.display();
	        
	        
	        list.retainDelete(M, N);
	        
	        System.out.print("Modified linked list: ");
	        list.display();
	    }
	}

