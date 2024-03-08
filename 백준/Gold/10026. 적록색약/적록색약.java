import java.util.Scanner;

public class Main {
	static int N;
	static char[][] map;
	static int cnt;
	static int cnt2;
	static boolean[][] visited;
	static boolean[][] visited2;
	static int[] dr = { 0, 1, 0, -1 };
	static int[] dc = { 1, 0, -1, 0 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = Integer.parseInt(sc.nextLine());

		map = new char[N][N];

		for (int i = 0; i < N; i++) {
			String str = sc.nextLine();
			for (int j = 0; j < N; j++) {
				map[i][j] = str.charAt(j);
			}
		}
		cnt=0;
		cnt2=0;

		visited = new boolean[N][N];
		visited2 = new boolean[N][N];
		
		count();
		
		System.out.println(cnt + " " + cnt2);

		

	}
	
	public static void count() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(!visited[i][j]) {
					visited[i][j]=true;
					find(i, j, map[i][j]);
					cnt++;
				}
				if(!visited2[i][j]) {
					visited2[i][j]=true;
					find2(i, j, map[i][j]);
					cnt2++;
				}
			}
		}
	}

	public static void find(int r, int c, char color) {

		for (int d = 0; d < 4; d++) {
			int nr = r + dr[d];
			int nc = c + dc[d];
			if (nr >= 0 && nc >= 0 && nr < N && nc < N && !visited[nr][nc] && map[nr][nc] == color) {
//				System.out.println(nr + " " + nc + " " + color + " " + map[nr][nc]);
				visited[nr][nc] = true;
				find(nr, nc, map[nr][nc]);
			}

		}

	}
	
	public static void find2(int r, int c, char color) {
		if(color=='B') {
			for (int d = 0; d < 4; d++) {
				int nr = r + dr[d];
				int nc = c + dc[d];
				if (nr >= 0 && nc >= 0 && nr < N && nc < N && !visited2[nr][nc] && map[nr][nc] == color) {
					visited2[nr][nc] = true;
					find2(nr, nc, map[nr][nc]);
				}

			}
		}
		else {
			for (int d = 0; d < 4; d++) {
				int nr = r + dr[d];
				int nc = c + dc[d];
				if (nr >= 0 && nc >= 0 && nr < N && nc < N && !visited2[nr][nc] && map[nr][nc] != 'B') {
					visited2[nr][nc] = true;
					find2(nr, nc, map[nr][nc]);
				}

			}
		}

		

	}

}
