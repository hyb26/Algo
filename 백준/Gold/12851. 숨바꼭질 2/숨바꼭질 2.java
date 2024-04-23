import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	static int N;
	static int K;
	static int result;
	static int resultcnt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		K = sc.nextInt();
		resultcnt = 0;

		if(N<K) {
			result = 987654321;
			find(N);
		}else {
			if(N>K) {
				result = N-K;
				resultcnt = 1;
			}else {
				result = 0;
				resultcnt = 1;
			}
		}

		System.out.println(result);
		System.out.println(resultcnt);

	}

	public static void find(int n) {
		PriorityQueue<int[]> list = new PriorityQueue<>((int[] a, int[] b) -> a[1] - b[1]);

		int[] dp = new int[200002];
		Arrays.fill(dp, 987654321);

		list.add(new int[] { n, 0 });
		dp[n] = 0;

		while (!list.isEmpty()) {
			int[] now = list.poll();

//			System.out.println(" " + now[0] + " " + now[1]);
			if (now[1] > result) {
				break;
			}

			if (now[0] == K) {
				result = now[1];
				resultcnt++;
//				System.out.println(now[0] + " " + now[1] + " " + result + " " + resultcnt);
				continue;

			}

			if (dp[now[0]] < now[1]) {
				continue;
			}

			dp[now[0]] = now[1];

			if (now[0] >= 0 && now[0] <= 2 * K) {
				if (now[0] < K) {
					if (now[0] != 0) {
						list.add(new int[] { now[0] * 2, now[1] + 1 });
					}
					list.add(new int[] { now[0] + 1, now[1] + 1 });
					if (now[0] > 0)
						list.add(new int[] { now[0] - 1, now[1] + 1 });
				}else {
					list.add(new int[] { K, now[0] - K + now[1] });
				}

			}

		}

	}
}
