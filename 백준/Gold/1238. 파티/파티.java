import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static class Node {
		int v;
		int w;

		public Node(int v, int w) {
			this.v = v;
			this.w = w;
		}
	}

	static int n;
	static int x;
	static List<List<Node>> list;
	static int[][] resultlist;
	static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		int m = sc.nextInt();
		x = sc.nextInt();

		list = new ArrayList<>();
		for (int i = 0; i < n + 1; i++) {
			list.add(new ArrayList<>());
		}
		for (int i = 0; i < m; i++) {
			list.get(sc.nextInt()).add(new Node(sc.nextInt(), sc.nextInt()));
		}
		resultlist = new int[2][n + 1];
		visited = new boolean[n + 1];
		
		int result = 0;

		for (int i = 1; i < n + 1; i++) {
			go(i);
		}
		from();

//		System.out.println(Arrays.toString(resultlist[0]));
//		System.out.println(Arrays.toString(resultlist[1]));

		for (int i = 1; i < n + 1; i++) {
			result = Math.max(result, (resultlist[0][i] + resultlist[1][i]));
		}

		System.out.println(result);

	}

	public static void go(int start) {
		Arrays.fill(visited, false);
		PriorityQueue<Node> tox = new PriorityQueue<>((Node a, Node b) -> a.w - b.w);
		tox.add(new Node(start, 0));
		while (!tox.isEmpty()) {
			Node temp = tox.poll();
			visited[temp.v] = true;

			if (temp.v == x) {
				resultlist[0][start] = temp.w;
				break;
			}
			for (int i = 0; i < list.get(temp.v).size(); i++) {
				if (!visited[list.get(temp.v).get(i).v]) {
					tox.add(new Node(list.get(temp.v).get(i).v, list.get(temp.v).get(i).w + temp.w));
				}
			}
		}
	}

	public static void from() {
		Arrays.fill(visited, false);
		int cnt = n;
		PriorityQueue<Node> fromx = new PriorityQueue<>((Node a, Node b) -> a.w - b.w);
		fromx.add(new Node(x, 0));
		while (!fromx.isEmpty() && cnt > 0) {
			Node temp = fromx.poll();
			if (!visited[temp.v]) {
				resultlist[1][temp.v] = temp.w;
				visited[temp.v] = true;
				cnt--;
			}
			for (int i = 0; i < list.get(temp.v).size(); i++) {
				if (!visited[list.get(temp.v).get(i).v]) {
					fromx.add(new Node(list.get(temp.v).get(i).v, list.get(temp.v).get(i).w + temp.w));
				}
			}
		}
	}

}
