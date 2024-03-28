import java.util.HashSet;
import java.util.Scanner;

public class Main {
	static int[] list;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		list = new int[N + 1];

		for (int i = 0; i <= N; i++) {
			list[i] = i;
		}

		for (int m = 0; m < M; m++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			find(b, c);
		}
		int sum = 0;
		int check = findroot(1);
		for (int i = 2; i < list.length; i++) {
			if(findroot(list[i])==check) {
				sum++;
			}
		}
		System.out.println(sum);

	}

	private static void find(int b, int c) {
		if (findroot(b) < findroot(c)) {
			list[findroot(c)] = findroot(b);
		} else {
			list[findroot(b)] = findroot(c);
		}

	}

	private static int findroot(int b) {
		if (list[b] != b) {
			return findroot(list[b]);
		}
		return b;

	}

}
