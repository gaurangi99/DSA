public class middleElementLL {
	public Node middleNode(Node head) {
		if (head == null) {
			return head;
		}
		Node cur = head;
		Node doubleCur = head;
		while (doubleCur != null && doubleCur.next != null) {
			doubleCur = doubleCur.next.next;
			cur = cur.next;
		}
		return cur;
	}
}
