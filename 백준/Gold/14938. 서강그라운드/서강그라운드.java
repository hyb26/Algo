import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	static int N, M, R, ans;
	static List<Node>[] adj;
	static int[] items;

	public static class Node implements Comparable<Node> {
		int V, W;

		public Node(int V, int W) {
			this.V = V;
			this.W = W;
		}

		@Override
		public int compareTo(Node n) {
			return this.W - n.W;
		}

	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
//		N = sc.nextInt();
//		M = sc.nextInt();
//		R = sc.nextInt();
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());

		adj = new List[N + 1];
		items = new int[N + 1];

		for (int i = 0; i <= N; i++) {
			adj[i] = new ArrayList<>();
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
//			items[i] = sc.nextInt();
			items[i] = Integer.parseInt(st.nextToken());
		}
		
		int A, B, C;
		for (int i = 0; i < R; i++) {
			st = new StringTokenizer(br.readLine());
//			int A = sc.nextInt();
//			int B = sc.nextInt();
//			int C = sc.nextInt();
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			C = Integer.parseInt(st.nextToken());

			adj[A].add(new Node(B, C));
			adj[B].add(new Node(A, C));
		}

		ans = 0;

		for (int i = 1; i <= N; i++) {
			dijkstra(i);
		}

		System.out.println(ans);

	}

	static void dijkstra(int start) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		boolean[] visited = new boolean[N + 1];
		int[] dist = new int[N + 1];

		Arrays.fill(dist, 987654321);
		dist[start] = 0;

		pq.add(new Node(start, 0));

		int sum = 0;
		while (!pq.isEmpty()) {
			Node curr = pq.poll();

			if (visited[curr.V])
				continue;

			sum += items[curr.V];
			visited[curr.V] = true;

			for (Node node : adj[curr.V]) {
				if (!visited[node.V] && M >= dist[curr.V] + node.W) {
					dist[node.V] = Math.min(dist[node.V], dist[curr.V] + node.W);
					pq.add(new Node(node.V, dist[node.V]));
				}
			}
		}

		ans = Math.max(ans, sum);

	}

}