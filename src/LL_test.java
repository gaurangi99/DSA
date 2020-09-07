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
		middleElementLL m=new middleElementLL();
		System.out.println(m.middleNode(l.getHead()));
		l.insert(1);
		System.out.println(m.middleNode(l.getHead()).val);
		l.insert(2);
		l.insert(3);
		l.insert(4);
		l.insert(5);
		System.out.println(m.middleNode(l.getHead()).val);
		l.insert(1);
		System.out.println(m.middleNode(l.getHead()).val);
	}
}
