

	class Node {
	    int data;
	    Node next;
	    
	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	class LinkedList {
	    Node head1;
	    Node head2;
	    
	    public LinkedList() {
	        this.head1 = null;
	        this.head2 = null;
	    }
	    
	    public void insertFirstList(int data) {
	        Node newNode = new Node(data);
	        
	        if (head1 == null) {
	            head1 = newNode;
	        } else {
	            Node current = head1;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newNode;
	        }
	    }
	    
	    public void insertSecondList(int data) {
	        Node newNode = new Node(data);
	        
	        if (head2 == null) {
	            head2 = newNode;
	        } else {
	            Node current = head2;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newNode;
	        }
	    }
	    
	    public void mergeLists() {
	        if (head1 == null || head2 == null) {
	            return; 
	        }
	        
	        Node current1 = head1;
	        Node current2 = head2;
	        
	        while (current1 != null && current2 != null) {
	            Node next1 = current1.next;
	            Node next2 = current2.next;
	            
	            current1.next = current2;
	            current2.next = next1;
	            
	            current1 = next1;
	            current2 = next2;
	        }
	        
	        head2 = null; 
	    }
	    
	    public void displayList(Node head) {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }
	    
	    public void display() {
	        System.out.print("First list: ");
	        displayList(head1);
	        
	        System.out.print("Second list: ");
	        displayList(head2);
	    }
	}

	public class LinkedList_Q7 {
	    public static void main(String[] args) {
	        LinkedList list = new LinkedList();
	        
	       
	        list.insertFirstList(5);
	        list.insertFirstList(7);
	        list.insertFirstList(17);
	        list.insertFirstList(13);
	        list.insertFirstList(11);
	        
	      
	        list.insertSecondList(12);
	        list.insertSecondList(10);
	        list.insertSecondList(2);
	        list.insertSecondList(4);
	        list.insertSecondList(6);
	        
	        System.out.print("Before merging: ");
	        list.display();
	        
	        
	        list.mergeLists();
	        
	        System.out.print("After merging: ");
	        list.display();
	    }
	}
