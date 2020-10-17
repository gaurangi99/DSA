import java.util.*;

public class countElementsOccurrenceInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println();
		int n=in.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=in.nextInt();
		}
		
		Map<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<n;i++) {
			map.put(ar[i],map.getOrDefault(ar[i],0)+1);
		}
		System.out.printf("Element->Count\n");
		for(Map.Entry<Integer, Integer> m:map.entrySet()) {
			System.out.printf("   %d   ->  %d\n",m.getKey(),m.getValue());
		}
	}
}
