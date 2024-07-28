import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int m;
	static boolean[] visited;
	static int[] resultlist;
	static List<PriorityQueue<Integer>> list;
	static int idx = 1;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());

		list = new ArrayList<>();

		for (int i = 0; i <= n; i++) {
			list.add(new PriorityQueue<>((a, b) -> a - b));
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			list.get(a).add(b);
			list.get(b).add(a);
		}
		resultlist = new int[n + 1];
		Arrays.fill(resultlist, n + 1);
		visited = new boolean[n + 1];
		Deque<Integer> bfs = new ArrayDeque<>();
		
		resultlist[r] = idx;
		idx++;
		visited[r] = true;
		
		bfs.add(r);
		while(!bfs.isEmpty()) {
			int temp = bfs.poll();
			int size = list.get(temp).size();
			for(int i = 0; i<size; i++) {
				int u = list.get(temp).poll();
				if(!visited[u]) {
					visited[u]=true;
					bfs.add(u);
					resultlist[u]=idx;
					idx++;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			if (resultlist[i] != n + 1)
				sb.append(resultlist[i]).append("\n");
			else {
				sb.append(0).append("\n");
			}
		}
		System.out.println(sb);

	}
}
