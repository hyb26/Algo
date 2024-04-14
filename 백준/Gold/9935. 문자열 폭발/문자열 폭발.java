import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	static Deque<int[]> line;
	static String[] bomb;
	static String[] str;
	static HashMap<String, Integer> list;
	static StringBuilder sb;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		sb = new StringBuilder();

		line = new ArrayDeque<>();
		str = sc.nextLine().split("");
		bomb = sc.nextLine().split("");
		list = new HashMap<>();
		for (int i = 0; i < bomb.length; i++) {
			list.put(bomb[i], i);
		}

		if (bomb.length == 1) {
			for (int idx = 0; idx < str.length; idx++) {
//				System.out.println(sb);
				if (str[idx].equals(bomb[0])) {
					continue;
				}
				sb.append(str[idx]);
			}
		} else {
			for (int idx = 0; idx < str.length; idx++) {
//			System.out.println(sb);
				if (str[idx].equals(bomb[0])) {
					line.add(new int[] {0, idx});
					int check = find(idx);
					idx = check;
					continue;
				}
				sb.append(str[idx]);
			}
		}

		if (sb.length() == 0) {
			System.out.println("FRULA");
		} else {
			System.out.println(sb);
		}

	}

	public static int find(int idx) {
		int startidx = idx;
		oo: while (!line.isEmpty() && idx < str.length - 1) {
			idx++;
			if (list.containsKey(str[idx])) {
				if (list.get(str[idx]) <= line.peekLast()[0] + 1) {
					line.add(new int[] {list.get(str[idx]), idx});
				} else {
					break oo;
				}

			} else {
				break oo;
			}

			if (line.peekLast()[0] == bomb.length - 1) {
				for (int i = bomb.length - 1; i >= 0; i--) {
					if (line.peekLast()[0] != i) {
						break oo;
					}
					line.pollLast();
				}
			}
//			System.out.println(line.size());
		}
		if (line.size() == 0) {
			return idx;
		}
		
		while (!line.isEmpty()) {
			int[] temp = line.pollFirst();
			sb.append(str[temp[1]]);
			startidx = temp[1];
		}
		return startidx;

	}
}