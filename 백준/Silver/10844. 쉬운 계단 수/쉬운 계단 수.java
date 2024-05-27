import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] list = new int[n][10];
		
		
		for(int i = 0; i<n; i++) {
			if(i==0) {
				for(int j = 1; j<=9; j++) {
					list[i][j]=1;
				}
			}else {
				for(int j = 0; j<=9; j++) {
					if(j==0) {
						list[i][j]=list[i-1][1];
					}else if(j==9) {
						list[i][j]=list[i-1][8];
					}else {
						list[i][j]=(list[i-1][j-1]+list[i-1][j+1])%1000000000;
					}
				}
			}
		}
		int sum = 0;
		for(int i = 0; i<10; i++) {
			sum=(sum+list[n-1][i])%1000000000;
		}
		
		System.out.println(sum);
	}

}
