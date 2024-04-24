import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int M;
	static int[][] delta = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
	static int result;
	static char[][] map;
	static int[][] dp1;
	static int[][] dp2;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		map = new char[N][M];
		dp1 = new int[N][M];
		dp2 = new int[N][M];

		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < M; j++) {
				map[i][j] = str.charAt(j);
			}
		}

		result = 987654321;

		dfs(0, 0);

		if (result == 987654321) {
			System.out.println(-1);
		} else {
			System.out.println(result);
		}

	}

	public static void dfs(int r, int c) {
		Queue<int[]> list = new LinkedList<>();
		list.add(new int[] { r, c, 1, 0});
		int repeatcnt = 0;
		
		dp1[r][c]=1;
		dp2[r][c]=1;
				

		while (!list.isEmpty()) {
			
			int[] temp = list.poll();
			r = temp[0];
			c = temp[1];
			int cnt = temp[2];
			int method = temp[3];
			
//			System.out.println(repeatcnt++ + " " + r + " " + c + " " + cnt);
			
			if(method==0) {
				if (r == N - 1 && c == M - 1) {
					result = Math.min(dp1[r][c], result);
					return;
				}

				for (int d = 0; d < 4; d++) {
					int nr = r + delta[d][0];
					int nc = c + delta[d][1];

					if (nr < N && nr >= 0 && nc < M && nc >= 0 && map[nr][nc]=='0') {
						if(dp1[nr][nc]==0 || dp1[nr][nc]>cnt+1) {
							dp1[nr][nc]=cnt+1;
							list.add(new int[] {nr, nc, cnt+1, method});
						}
					}else if (nr < N && nr >= 0 && nc < M && nc >= 0 && map[nr][nc]=='1'){
						if(dp2[nr][nc]==0 || dp2[nr][nc]>cnt+1) {
							dp2[nr][nc]=cnt+1;
							list.add(new int[] {nr, nc, cnt+1, method+1});
						}
					}
				}
			}else {
				
				if (r == N - 1 && c == M - 1) {
					result = Math.min(dp2[r][c], result);
					return;
				}
				for (int d = 0; d < 4; d++) {
					int nr = r + delta[d][0];
					int nc = c + delta[d][1];

					if (nr < N && nr >= 0 && nc < M && nc >= 0 && map[nr][nc]=='0') {
						if(dp2[nr][nc]==0 || dp2[nr][nc]>cnt+1) {
							dp2[nr][nc]=cnt+1;
							list.add(new int[] {nr, nc, cnt+1, method});
						}
					}
				}
			}
		}
	}
}
