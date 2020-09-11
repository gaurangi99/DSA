import java.util.Scanner;

public class LL_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		LinkedList l = new LinkedList();
		System.out.println();
		l.insert(1);
		l.insert(2);
		l.insert(3);
		l.insert(4);
		l.insert(5);
		l.insert(1);
		l.display();
		l.delete(1);
		l.display();
		l.delete(2);
		l.display();
		l.delete(3);
		l.display();
		l.delete(4);
		l.display();
		l.delete(5);
		l.display();
		l.delete(6);
		l.insertAtEnd(1);
		l.insertAtEnd(2);
		l.insertAtEnd(3);
		l.insertAtEnd(4);
		l.insertAtEnd(5);
		l.insertAtEnd(1);
		l.display();
		middleElementLL m=new middleElementLL();
		System.out.println(m.middleNode(l.getHead()).val);
		l.insert(1);
		System.out.println(m.middleNode(l.getHead()).val);
		l.insert(2);
		l.insert(3);
		l.insert(4);
		l.insert(5);
		l.display();
		System.out.println(m.middleNode(l.getHead()).val);
		l.insert(1);
		l.display();
		System.out.println(m.middleNode(l.getHead()).val);
		
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		l1.insert(3);
		l1.insert(4);
		l1.insert(2);
		l1.display();
		l2.insert(4);
		l2.insert(6);
		l2.insert(5);
		l2.display();
		add2LL a=new add2LL();
		System.out.println((a.adding(l1.getHead(),l2.getHead())));
	}
}
