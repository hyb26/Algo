import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static ArrayList<Integer[]> list;
	static int[][] method;
	static int[][] map;
	static int N;
	static int M;
	static int K;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		list = new ArrayList<>();

		N = sc.nextInt();
		M = sc.nextInt();
		K = sc.nextInt();

		map = new int[N][M];
		method = new int[K][3];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				map[i][j] = sc.nextInt();
			}
		}

		for (int tc = 0; tc < K; tc++) {
			for (int me = 0; me < 3; me++) {
				method[tc][me] = sc.nextInt();
			}
		}

		// 순서 조합
		Integer[] temp = new Integer[K];
		for (int i = 0; i < K; i++) {
			temp[i] = 0;
		}
		boolean[] visited = new boolean[K];

		turn(0, temp, visited);

		int result = 100000;
		

		for (int rere = 0; rere < list.size(); rere++) {
			int[][] maprepl = new int[N][M];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					maprepl[i][j]=map[i][j];
				}
			}
			for (int tc = 0; tc < K; tc++) {
				int r = method[list.get(rere)[tc]][0] - 1;
				int c = method[list.get(rere)[tc]][1] - 1;
				int s = method[list.get(rere)[tc]][2];

				for (int h = 1; h <= s; h++) {
					rotation(r - h, c - h, (2 * h + 1), maprepl);
				}
			}
			for (int n = 0; n < N; n++) {

				int sum = 0;
				for (int m = 0; m < M; m++) {
					sum += maprepl[n][m];
				}
				result = Math.min(sum, result);
			}
		}

		System.out.println(result);

	}

	public static void rotation(int r, int c, int s, int[][] maprepl) {

//		System.out.println(r + " " + c + " " + s );

		Queue<Integer> numlist = new LinkedList<>();

		int[] dr = { 0, 1, 0, -1 };
		int[] dc = { 1, 0, -1, 0 };

		int nr = r;
		int nc = c;

		for (int d = 0; d < 4; d++) {
			for (int dd = 1; dd < s; dd++) {
//				System.out.println(map[nr][nc]);

				numlist.add(maprepl[nr][nc]);
				nr = nr + dr[d];
				nc = nc + dc[d];
			}

		}

		for (int d = 0; d < 4; d++) {
			for (int dd = 1; dd < s; dd++) {
				nr = nr + dr[d];
				nc = nc + dc[d];
				maprepl[nr][nc] = numlist.poll();

			}
		}
	}

	public static void turn(int cnt, Integer[] temp, boolean[] visited) {
		if (cnt == K) {
			Integer[] temp2 = new Integer[K];
			for (int te = 0; te < temp.length; te++) {
				temp2[te] = temp[te];
			}
			list.add(temp2);
			return;
		}

		for (int i = 0; i < K; i++) {

			if (!visited[i]) {
				temp[cnt] = i;
				visited[i] = true;
				turn(cnt + 1, temp, visited);
				visited[i] = false;
			}

		}

	}

}
