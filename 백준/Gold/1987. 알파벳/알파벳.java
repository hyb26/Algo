import java.util.Scanner;

public class Main {
	static int[][] map;
	static int R;
	static int C;
	static int result;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] start = sc.nextLine().split(" ");
		R = Integer.parseInt(start[0]);
		C = Integer.parseInt(start[1]);

		map = new int[R][C];

		for (int i = 0; i < R; i++) {
			String str = sc.nextLine();
			for (int j = 0; j < C; j++) {
                if(str.charAt(j)>='A' && str.charAt(j)<='Z')
				    map[i][j] = str.charAt(j) - 'A';
			}
		}

		int[] resultlist = new int[26];
		resultlist[map[0][0]]++;

		dfs(0, 0, 1, resultlist);
		
		System.out.println(result);
	}

	public static void dfs(int r, int c, int sum, int[] list) {
		int cnt = 0;
		if (r + 1 < R && r + 1 >= 0 && list[map[r + 1][c]] == 0) {
			cnt++;
			list[map[r + 1][c]]++;
			dfs(r + 1, c, sum + 1, list);
			list[map[r + 1][c]]--;
		}
		if (r - 1 < R && r - 1 >= 0 && list[map[r - 1][c]] == 0) {
			cnt++;
			list[map[r - 1][c]]++;
			dfs(r - 1, c, sum + 1, list);
			list[map[r - 1][c]]--;

		}
		if (c + 1 < C && c + 1 >= 0 && list[map[r][c + 1]] == 0) {
			cnt++;
			list[map[r][c + 1]]++;
			dfs(r, c + 1, sum + 1, list);
			list[map[r][c + 1]]--;

		}
		if (c - 1 < C && c - 1 >= 0 && list[map[r][c - 1]] == 0) {
			cnt++;
			list[map[r][c - 1]]++;
			dfs(r, c - 1, sum + 1, list);
			list[map[r][c - 1]]--;

		}
		if(cnt==0) {
			result = Math.max(result, sum);
            return;
		}
	}

}
