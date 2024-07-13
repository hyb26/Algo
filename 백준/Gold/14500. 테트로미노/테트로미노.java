import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int m;
	static int[][] list;
	static boolean[][] visited;
	static int result;
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 StringTokenizer st = new StringTokenizer(br.readLine());
		 n = Integer.parseInt(st.nextToken());
		 m = Integer.parseInt(st.nextToken());
		 
		 list = new int[n][m];
		 
		 for(int i = 0; i<n; i++) {
			 st = new StringTokenizer(br.readLine());
			 for(int j = 0; j<m; j++) {
				 list[i][j]=Integer.parseInt(st.nextToken());
			 }
		 }
		 visited = new boolean[n][m];
		 result = 0;
		 
		 for(int i = 0; i<n; i++) {
			 for(int j = 0; j<m; j++) {
				 visited[i][j]=true;
				 dfs(i, j, list[i][j], 1);
				 visited[i][j]=false;
			 }
		 }
		
		 middle();
		 
		 System.out.println(result);
		 
		 
	}
	public static void dfs(int r, int c, int sum, int cnt) {
		if(cnt==4) {
			if(sum>result){
				result = sum;
			}
			return;
		}
		
		if(r+1<n && !visited[r+1][c]) {
			visited[r+1][c]=true;
			dfs(r+1, c, sum+list[r+1][c], cnt+1);
			visited[r+1][c]=false;
		}
		if(r-1>=0 && !visited[r-1][c]) {
			visited[r-1][c]=true;
			dfs(r-1, c, sum+list[r-1][c], cnt+1);
			visited[r-1][c]=false;
		}
		if(c+1<m && !visited[r][c+1]) {
			visited[r][c+1]=true;
			dfs(r, c+1, sum+list[r][c+1], cnt+1);
			visited[r][c+1]=false;
		}
		if(c-1>=0 && !visited[r][c-1]) {
			visited[r][c-1]=true;
			dfs(r, c-1, sum+list[r][c-1], cnt+1);
			visited[r][c-1]=false;
		}
	}
	public static void middle() {
		for(int i = 0; i<n-2; i++) {
			 for(int j = 0; j<m-1; j++) {
				 int temp = list[i][j]+list[i+1][j]+list[i+2][j]+list[i+1][j+1];
				 if(temp>result){
						result = temp;
					}
			 }
		 }
		for(int i = 0; i<n-2; i++) {
			 for(int j = 0; j<m-1; j++) {
				 int temp = list[i+1][j]+list[i][j+1]+list[i+2][j+1]+list[i+1][j+1];
				 if(temp>result){
						result = temp;
					}
			 }
		 }
		for(int i = 0; i<n-1; i++) {
			 for(int j = 0; j<m-2; j++) {
				 int temp = list[i][j+1]+list[i+1][j]+list[i+1][j+2]+list[i+1][j+1];
				 if(temp>result){
						result = temp;
					}
			 }
		 }
		for(int i = 0; i<n-1; i++) {
			 for(int j = 0; j<m-2; j++) {
				 int temp = list[i][j+1]+list[i][j]+list[i][j+2]+list[i+1][j+1];
				 if(temp>result){
						result = temp;
					}
			 }
		 }
	}

}
