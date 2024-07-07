import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String b = sc.nextLine();
		
		int asize = a.length();
		int bsize = b.length();
		
		int[][] dp = new int[asize+1][bsize+1];
		
		for(int i = 0; i<asize+1; i++) {
			for(int j = 0; j<bsize+1; j++) {
				if(i==0) {
					dp[i][j]=j;
					continue;
				}
				if(j==0) {
					dp[i][j]=i;
					continue;
				}
				if(a.charAt(i-1)==b.charAt(j-1)) {
					dp[i][j]=dp[i-1][j-1];
				}else {
					dp[i][j]=Math.min(dp[i-1][j], Math.min(dp[i-1][j-1], dp[i][j-1]))+1;
				}
				
			}
		}
		System.out.println(dp[asize][bsize]);
	}
}
