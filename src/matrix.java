import java.util.*;

public class matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println();
		int m=in.nextInt();
		int n=in.nextInt();
		int[][] mat=new int[m][n];
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				mat[i][j]=in.nextInt();
			}
		}
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.printf("%d ", mat[i][j]);
			}
			System.out.println();
		}
	}

}
