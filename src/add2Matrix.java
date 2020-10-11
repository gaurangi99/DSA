import java.util.Scanner;

public class add2Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println();
		int m=in.nextInt();
		int n=in.nextInt();
		int[][] mat1=new int[m][n];
		int[][] mat2=new int[m][n];
		
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				mat1[i][j]=in.nextInt();
			}
		}
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				mat2[i][j]=in.nextInt();
			}
		}
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.printf("%d ", mat1[i][j]+mat2[i][j]);
			}
			System.out.println();
		}
	}
}
