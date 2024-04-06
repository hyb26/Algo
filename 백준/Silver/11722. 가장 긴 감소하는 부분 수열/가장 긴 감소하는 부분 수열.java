import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] dp = new int[1001];
		
		int result = 0;

		for(int i = 0; i<N; i++) {
			int temp = sc.nextInt();
			int max = 0;
			for(int idx = temp+1; idx<=1000; idx++) {
				if(dp[idx]!=0) {
					max = Math.max(max, dp[idx]);
				}
			}
			dp[temp] = Math.max(dp[temp], max+1);
			result = Math.max(result, dp[temp]);
//			System.out.println(Arrays.toString(dp));
		}
		System.out.println(result);		
		
	}

}
