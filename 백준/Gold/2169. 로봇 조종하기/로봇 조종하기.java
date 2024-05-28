import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int m;
	static int[][] map;
	static int[][] dp;
	static int max;
	static int idx;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		map = new int[n][m];
		dp = new int[n][m];
		
		for(int i = 0; i<n; i++) {
			Arrays.fill(dp[i], -987654321);
		}
		
		for(int i = 0; i<n; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			for(int j = 0; j<m; j++) {
				map[i][j] = Integer.parseInt(st1.nextToken());
			}
		}
		int sum = 0;
		for(int j = 0; j<m; j++) {
			sum+=map[0][j];
			dp[0][j]= sum;
		}
		
		for(int i = 1; i<n; i++) {
			int[][] temp = new int[2][m];
			for(int j = 0; j<m; j++) {
				if(j==0) {
					temp[0][j]=dp[i-1][j]+map[i][j];
				}else {
					temp[0][j]=Math.max(temp[0][j-1], dp[i-1][j]) + map[i][j];
				}
			}
			for(int j = m-1; j>=0; j--) {
				if(j==m-1) {
					temp[1][j]=dp[i-1][j]+map[i][j];
				}else {
					temp[1][j]=Math.max(temp[1][j+1], dp[i-1][j]) + map[i][j];
				}
				dp[i][j]=Math.max(temp[0][j], temp[1][j]);
			}
		}
		System.out.println(dp[n-1][m-1]);
		
	}

}
