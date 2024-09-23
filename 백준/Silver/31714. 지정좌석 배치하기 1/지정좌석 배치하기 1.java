import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int[][] chair = new int[n][m];
		
		for(int i = 0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j<m; j++) {
				chair[i][j]=Integer.parseInt(st.nextToken());
			}
			Arrays.sort(chair[i]);
		}
		String result = "YES";
		
		for(int i = 0; i<m; i++) {
			for(int j = 1; j<n; j++) {
				if(chair[j][i]+d<=chair[j-1][i]) {
					result = "NO";
				}
			}
		}
		
		System.out.println(result);
		
	}

}
