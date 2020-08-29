public class LinkedList {
	Node head;

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.insert(3);
		l.insert(4);
		l.insert(5);
		display(l.head);
	}

	public Node insert(int k) {
		Node newNode;
		if (head == null) {
			newNode = new Node(k, null);
			head = newNode;
		} else {
			Node cur = head;
			newNode = new Node(k, cur);
			head= newNode;
		}
		return head;
	}

	public Node insertKAfterEveryElement(int k) {
		Node newNode;
		if (head == null) {
			newNode = new Node(k, null);
		}
		Node cur = head;
		while (cur != null) {
			newNode = new Node(k, cur.next);
			cur.next = newNode;
			cur = newNode.next;
		}
		return head;
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
		Node cur = head;
		if(cur==null) {
			;
		}
		if (cur.val == k && cur.next==null) {
			head = cur.next;
		}
		while (cur.next != null) {
			if (cur.next.val == k) {
				cur.next = cur.next.next;
			}
			cur = cur.next;
		}
		return head;
	}

}
