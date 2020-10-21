public class oddEven {

	LinkedList oddEvenList(LinkedList l) {
		// we're making a copy of the original list, using extra space
		// try without it
		LinkedList oddList = new LinkedList();
		LinkedList evenList = new LinkedList();

		Node cur = l.head;
		while (cur != null) {
			if (cur.val % 2 == 0) {
				evenList.insertAtTail(cur.val);
			} else {
				oddList.insertAtTail(cur.val);
			}
			cur = cur.next;
		}
		evenList.tail.next = oddList.head;
		return evenList;
	}

	LinkedList oddEvenPlace(LinkedList l) {
		LinkedList oddList = new LinkedList();
		LinkedList evenList = new LinkedList();

		Node cur = l.head;
		int ctr = 1;
		while (cur != null) {
			if (ctr % 2 == 0) {
				evenList.insertAtTail(cur.val);
			} else {
				oddList.insertAtTail(cur.val);
			}
			cur = cur.next;
			ctr++;
		}
		evenList.tail.next = oddList.head;
		return evenList;
	}
}