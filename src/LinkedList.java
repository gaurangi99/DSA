public class LinkedList {
	Node head;

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		insert(3, l.head);
		insert(4, l.head);
		insert(5, l.head);
		display(l.head);
	}

	public static Node insert(int k, Node head) {
		if(head==null) {
			Node newNode=new Node(k, head);
			head=newNode;
			return newNode;
		}
		else {
			Node newNode=new Node(k, head.next);
			head.next=newNode;
			return newNode;
		}
	}

	public static void display(Node head) {
		Node cur = head;
		while (cur != null) {
			System.out.printf("%d->", cur.val);
			cur = cur.next;
		}
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
		int countEven=0;
		Node cur=head;
		while(cur!=null) {
			if(cur.val%2==0) 
				countEven++;
			cur=cur.next;
		}
		return countEven;
	}
	
	public static void printKthElement(Node head, int k) {
		Node cur=head;
		int count=1;
		while(cur!=null) {
			if(count%k==0)
				System.out.printf("%d, ", cur.val);
			cur=cur.next;
			count++;
		}
	}
	
	public static Node delete(Node head, int k) {
		Node cur=head;
		if(cur.val==k) {
			head=head.next;
		}
		while(cur!=null && cur.next!=null) {
			if(cur.next.val==k) {
				cur.next=cur.next.next;
			}
			cur=cur.next;
		}
		return head;
	}
	
}
