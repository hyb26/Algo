import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int[] result;
	static int N;
	static List<int[]> list;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		int E = sc.nextInt();

		result = new int[N + 1];
		for (int n = 0; n <= N; n++) {
			result[n] = n;
		}

		list = new ArrayList<>();
		
		for (int n = 0; n < E; n++) {
			int[] temp = new int[3];
			temp[0] = sc.nextInt();
			temp[1] = sc.nextInt();
			temp[2] = sc.nextInt();
			list.add(temp);
		}

		Collections.sort(list, (int[] a, int[] b)-> a[2]-b[2]);

		int idx = 0;
		int sum = 0;
		while (idx < E) {
			int a = findroot(list.get(idx)[0]);
			int b = findroot(list.get(idx)[1]);
			if (a != b) {
				if (a < b) {
					result[b] = a;
				} else {
					result[a] = b;
				}

				sum += list.get(idx)[2];
			}
			idx++;

		}
		System.out.println(sum);

	}

	public static int findroot(int b) {
		if (result[b] == b) {
			return b;
		}
		return result[b] = findroot(result[b]);

	}

}