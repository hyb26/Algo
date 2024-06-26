import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static List<Integer[]> list;
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		list = new ArrayList<>();
		int[][] map = new int[9][9];
		for (int i = 0; i < 9; i++) {
			String str = sc.nextLine();
			for (int j = 0; j < 9; j++) {
				map[i][j] = str.charAt(j)-'0';
				if (map[i][j] == 0)
					list.add(new Integer[] { i, j });
			}
		}

		sudoku(0, map);

		
	}

	public static void sudoku(int idx, int[][] map) {
		if (idx == list.size()) {
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					System.out.print(map[i][j]);
				}
				System.out.println();
			}
			System.exit(0);
		}
		int r = list.get(idx)[0];
		int c = list.get(idx)[1];

//		if (map[r][c] == 0) {
		oo: for (int i = 1; i <= 9; i++) {
			for (int ti = 0; ti < 9; ti++) {
				if (map[r][ti] == i || map[ti][c] == i) {
					continue oo;
				}
			}
			if (check(r, c, i, map)) {
//				System.out.println(i);
				map[r][c] = i;
				sudoku(idx + 1, map);
				map[r][c] = 0;
			}
		}
//		}
		return;

	}

	public static boolean check(int r, int c, int value, int[][] map) {
//		System.out.println(r + " " + c + " " + value);
		if (r % 3 == 0) {
			if (c % 3 == 0) {
				for (int i = r; i < r + 3; i++) {
					for (int j = c; j < c + 3; j++) {
						if (map[i][j] == value)
							return false;
					}
				}
			} else if (c % 3 == 1) {
				for (int i = r; i < r + 3; i++) {
					for (int j = c - 1; j < c + 2; j++) {
						if (map[i][j] == value)
							return false;
					}
				}
			} else {
				for (int i = r; i < r + 3; i++) {
					for (int j = c - 2; j < c + 1; j++) {
						if (map[i][j] == value)
							return false;
					}
				}
			}
		} else if (r % 3 == 1) {
			if (c % 3 == 0) {
				for (int i = r - 1; i < r + 2; i++) {
					for (int j = c; j < c + 3; j++) {
						if (map[i][j] == value)
							return false;
					}
				}
			} else if (c % 3 == 1) {
				for (int i = r - 1; i < r + 2; i++) {
					for (int j = c - 1; j < c + 2; j++) {
						if (map[i][j] == value)
							return false;
					}
				}
			} else {
				for (int i = r - 1; i < r + 2; i++) {
					for (int j = c - 2; j < c + 1; j++) {
						if (map[i][j] == value)
							return false;
					}
				}
			}
		} else {
			if (c % 3 == 0) {
				for (int i = r - 2; i < r + 1; i++) {
					for (int j = c; j < c + 3; j++) {
						if (map[i][j] == value)
							return false;
					}
				}
			} else if (c % 3 == 1) {
				for (int i = r - 2; i < r + 1; i++) {
					for (int j = c - 1; j < c + 2; j++) {
						if (map[i][j] == value)
							return false;
					}
				}
			} else {
				for (int i = r - 2; i < r + 1; i++) {
					for (int j = c - 2; j < c + 1; j++) {
						if (map[i][j] == value)
							return false;
					}
				}
			}
		}
		return true;

	}
}
