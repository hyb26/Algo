import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] cnt = new int[N + 1];

		List<List<Integer>> list = new ArrayList<>();

		Stack<Integer> stack = new Stack<>();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N + 1; i++) {
			list.add(new ArrayList<>());
		}
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			list.get(b).add(a);
			cnt[a]++;
		}

		for (int i = 1; i < N + 1; i++) {
			if (cnt[i] == 0)
				stack.add(i);
		}

		sb.append(" ");
		
		while (!stack.isEmpty()) {
			int temp = stack.pop();
			for (int i = 0; i < list.get(temp).size(); i++) {
				cnt[list.get(temp).get(i)]--;
				if(cnt[list.get(temp).get(i)]==0) {
					stack.add(list.get(temp).get(i));
				}
			}
			sb.insert(0, temp+" ");
		}
		
		System.out.println(sb);

	}

}