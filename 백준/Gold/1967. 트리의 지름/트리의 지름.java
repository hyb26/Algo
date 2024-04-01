import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	static class Node {
		int v;
		int w;

		public Node(int v, int w) {
			this.v = v;
			this.w = w;
		}
	}

	static int N;
	static List<List<Node>> list;
	static int result;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		list = new ArrayList<>(); // 0은 왼쪽, 1은 오른쪽
		result = 0;

		for (int n = 0; n <= N; n++) {
			list.add(new ArrayList<>());
		}

		for (int n = 0; n < N - 1; n++) {
			list.get(sc.nextInt()).add(new Node (sc.nextInt(), sc.nextInt()));
		}
		

		dfs(1);

		System.out.println(result);

	}

	public static int dfs(int start) {
		int[] templist = new int[list.get(start).size()];
		if (list.get(start).size() == 0) {
			return 0;
		}
		if (list.get(start).size() == 1) {
			int temp = dfs(list.get(start).get(0).v) + list.get(start).get(0).w;
			result = Math.max(result, temp);
			return temp;
		}
		if (list.get(start).size() >= 2) {
			for (int i = 0; i < list.get(start).size(); i++) {
				templist[i] = dfs(list.get(start).get(i).v) + list.get(start).get(i).w;
			}
			Arrays.sort(templist);
//			System.out.println(Arrays.toString(templist) + " " +result);

			result = Math.max(result, templist[list.get(start).size()-1] + templist[list.get(start).size()-2]);
			return Math.max(templist[list.get(start).size()-1], templist[list.get(start).size()-2]);
		}
		return 0;
		

	}

}
