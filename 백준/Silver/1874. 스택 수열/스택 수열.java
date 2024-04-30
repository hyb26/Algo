import java.util.Scanner;
import java.util.Stack;

public class Main {
	static Stack<Integer> stack;
	static StringBuilder sb;
	static int point;
	static int[] origin;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		stack = new Stack<>();
		sb = new StringBuilder();

		int n = sc.nextInt();
		origin = new int[n];

		for (int i = 0; i < n; i++) {
			origin[i] = sc.nextInt();
		}
		stack.add(1);
		sb.append("+" + "\n");
		point = 0;
		for (int i = 2; i <= n; i++) {
			if (stack.peek() == origin[point]) {
				find();
			}
			stack.add(i);
			sb.append("+" + "\n");

		}
		
		if(!stack.isEmpty()) {
			find();
		}

		if (!stack.isEmpty()) {
			System.out.println("NO");
			System.exit(0);
		}
		System.out.println(sb);
	}

	public static void find() {
		while (!stack.isEmpty() && stack.peek() == origin[point]) {
			stack.pop();
			sb.append("-" + "\n");
			point++;
		}
	}

}
