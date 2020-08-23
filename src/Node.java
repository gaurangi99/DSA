public class Node {
	int val;
	Node next;
	
	Node(Node head, int val){
		this.val=val;
		next=head.next;
	}
}
