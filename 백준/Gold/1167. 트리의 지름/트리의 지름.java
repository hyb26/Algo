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

		for (int n = 0; n < N; n++) {
			int pm = sc.nextInt();
			while (true) {
				int a = sc.nextInt();
				if (a == -1) {
					break;
				}
				int b = sc.nextInt();
				list.get(pm).add(new Node(a, b));
			}

		}
		

		boolean[] visited = new boolean[N + 1];
		dfs(1, visited);

		System.out.println(result);

	}

	public static int dfs(int start, boolean[] visited) {
		List<Integer> templist = new ArrayList<>();
		
		visited[start]=true;

		if (list.get(start).size() == 1) {
			if (!visited[list.get(start).get(0).v]) {
				int temp = dfs(list.get(start).get(0).v, visited) + list.get(start).get(0).w;
				result = Math.max(result, temp);
				return temp;
			}
		}
		if (list.get(start).size() >= 2) {
			for (int i = 0; i < list.get(start).size(); i++) {
				if (!visited[list.get(start).get(i).v]) {
					templist.add(dfs(list.get(start).get(i).v, visited) + list.get(start).get(i).w);
				}
			}
			Collections.sort(templist);
//			System.out.println(Arrays.toString(templist) + " " +result);

			if(templist.size()>1) {
				result = Math.max(result, templist.get(templist.size()-1) + templist.get(templist.size()-2));
				return templist.get(templist.size()-1);
			}
			else if(templist.size()==1) {
				result = Math.max(result, templist.get(0));
				return templist.get(0);
			}
			
		}
		return 0;

	}

}