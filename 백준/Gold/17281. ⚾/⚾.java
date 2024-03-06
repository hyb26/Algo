import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int[][] playerlist;
	static int N;
	static int max;
	static int premax;
	static int count;
	static int[] temp;
	static boolean[] visited;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(bf.readLine());

		playerlist = new int[N][9]; // 배열 생성
		for (int n = 0; n < N; n++) {
			String str = bf.readLine();
			StringTokenizer st = new StringTokenizer(str);
			for (int c = 0; c < 9; c++) {
				playerlist[n][c] = Integer.parseInt(st.nextToken());
			}
		}

		max = 0;
		count = 0;

		visited = new boolean[9];
		temp = new int[9];
		turn(0);

		System.out.println(max);
	}

	public static void turn(int cnt) {
		if (cnt == 9) {
			max = Math.max(max, play(temp));
			return;
		}

		if (cnt == 3) {
			turn(cnt + 1);
			return;
		}
		for (int i = 1; i < 9; i++) {
			if (!visited[i]) {
				visited[i] = true;
				temp[cnt] = i;
				turn(cnt + 1);
				visited[i] = false;
			}
		}

	}

	public static int play(int[] turnlist) {
		ArrayList<Integer> venue = new ArrayList<>();

		int i = 0;
		int out = 0;
		int score = 0;
		int inning = 0;

		while (inning < N) {

			int player = playerlist[inning][turnlist[i]];
			venue.add(player);
			if (i == 8) { // 다음으로 올 선수 번호
				i = 0;
			} else
				i++;

			if (player > 0) {
				score++;
			}

			if (player == 0) {
				out++;
				if (out == 3) {
					inning++;
					out = 0;
					int cnt = 0;
					for (int j = venue.size() - 1; j >= 0; j--) {
						
						cnt += venue.get(j);
						if (venue.get(j) > 0) {
							score--;
						}
						if (cnt == 3)
							break;
						else if (cnt > 3) {
							score = score+1;
							break;
						}
						//System.out.println(j + " " + score + " " + cnt);

					}
					venue.clear();
					continue;
				}
			}

		}

		return score;

	}
}
