import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	static int[][] ju;
	static Stack<Integer> numcnt;
	static int T;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();

		ju = new int[T][6]; // 0과 5, 1과 3, 2와 4
		int[][] jucopy = new int[T][6];

		for (int i = 0; i < T; i++) {
			for (int j = 0; j < 6; j++) {
				jucopy[i][j] = sc.nextInt();
			}
		}

		int result = 0;
		for (int i = 0; i < 6; i++) {
			for (int k = 0; k < T; k++) {
				for (int j = 0; j < 6; j++) {
					ju[k][j] = jucopy[k][j];
				}
			}

			find(0, ju[0][i]);
			int sum = 0;

			for (int j = 0; j < T; j++) {
				int max = 0;
				for (int k = 0; k < 6; k++) {
					max = Math.max(max, ju[j][k]);
				}
				sum = sum + max;
			}
			result = Math.max(sum, result);

		}
		System.out.println(result);

	}

	public static void find(int a, int g) {
		if (a < T) {
			for (int i = 0; i < 6; i++) {
				if (ju[a][i] == g) {
					ju[a][i] = 0;
					if (i == 0) {
						int value = ju[a][5];
						ju[a][5] = 0;
						find(a + 1, value);
						return;
					} else if (i == 1) {
						int value = ju[a][3];
						ju[a][3] = 0;
						find(a + 1, value);
						return;
					} else if (i == 2) {
						int value = ju[a][4];
						ju[a][4] = 0;
						find(a + 1, value);
						return;
					} else if (i == 3) {
						int value = ju[a][1];
						ju[a][1] = 0;
						find(a + 1, value);
						return;
					} else if (i == 4) {
						int value = ju[a][2];
						ju[a][2] = 0;
						find(a + 1, value);
						return;
					} else {
						int value = ju[a][0];
						ju[a][0] = 0;
						find(a + 1, value);
						return;
					}
				}
			}
		}
		return;

	}

}
