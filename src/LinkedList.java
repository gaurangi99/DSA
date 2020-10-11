import java.util.*;

public class LinkedList {
	public Node head;
	public Node tail;

//	public Node getHead() {
//		return head;
//	}
//
//	public Node setHead(Node head) {
//		this.head = head;
//		return this.head;
//	}

	public Node insert(int k) {
//		Node newNode;
//		if (head == null) {
//			newNode = new Node(k, null);
//			head = newNode;
//		} else {
//			Node cur = head;
//			newNode = new Node(k, cur);
//			head = newNode;
//		}

		// optimized to the following
		head = new Node(k, head);
		return head;
	}

	// to check "adding 2 LL"
	public Node insertAtEnd(int k) {
		if (head == null) {
			insert(k);
		} else {
			Node cur = head;
			while (cur.next != null) {
				cur = cur.next;
			}
			cur.next = new Node(k, null);
		}
		return head;
	}

	void insertAtTail(int k) {
		if (tail == null) {
			tail = new Node(k, null);
			head=tail;
		} else {
			tail.next = new Node(k, null);
			tail = tail.next;
		}
	}

	public Node insertKAfterEveryElement(int k) {
		Node newNode;
		if (head == null) {
			head = new Node(k, null);	//newNode
		}
		Node cur = head;
		while (cur != null) {
			newNode = new Node(k, cur.next);
			cur.next = newNode;
			cur = newNode.next;
		}
		return head;
	}

	public void display() {
		Node cur = head;
		if (head == null) {
			System.out.println("List is empty!");
		}
		while (cur != null) {
			System.out.printf("%d->", cur.val);
			cur = cur.next;
		}
		System.out.println();
	}

	public static int count(Node head) {
		int count = 0;
		Node cur = head;
		while (cur != null) {
			count++;
			cur = cur.next;
		}
		return count;
	}

	public static int countEven(Node head) {
		int countEven = 0;
		Node cur = head;
		while (cur != null) {
			if (cur.val % 2 == 0)
				countEven++;
			cur = cur.next;
		}
		return countEven;
	}

	public static void printKthElement(Node head, int k) {
		Node cur = head;
		int count = 1;
		while (cur != null) {
			if (count % k == 0)
				System.out.printf("%d, ", cur.val);
			cur = cur.next;
			count++;
		}
	}

	public Node delete(int k) {
		if (head == null) {
			System.out.printf("ABORT!! List is empty!%n");
		}
		if (head != null && head.val == k) {
			head = head.next;
		}
		Node cur = head;
		while (cur != null && cur.next != null) {
			if (cur.next.val == k) {
				cur.next = cur.next.next;
			}
			cur = cur.next;
		}
		if (cur != null && cur.val == k && cur.next == null) {
			head = cur.next;
		}
		return head;
	}
		
	public Node oddEvenList(Node head) {
        if(head==null || head.next==null || head.next.next==null){
            return head;
        }
        
        Node oddList=null;
        Node evenList=null;
        
        Node cur=head;

        int ctr=0;
        while(cur!=null) {
			if(ctr%2!=0) {
                insert(cur.val,evenList);
			}
			else {
                insert(cur.val,oddList);
			}			
			cur=cur.next;
			ctr++;
		}
        
        cur=oddList;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=evenList;
        
        return oddList;
    }
	
	void insert(int val,Node head){
        if(head==null){
            head=new Node(val,head);
        }
        
        Node cur=head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=new Node(val, null);
    }
}
