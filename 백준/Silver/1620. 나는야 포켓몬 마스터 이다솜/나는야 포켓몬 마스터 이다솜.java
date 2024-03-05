import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(bf.readLine());
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		HashMap<Integer, String> list1 = new HashMap<>();
		HashMap<String, Integer> list2 = new HashMap<>();

		for (int n = 0; n < N; n++) {
			String temp = bf.readLine();
			list1.put(n + 1, temp);
			list2.put(temp, n + 1);
		}

		for (int m = 0; m < M; m++) {
			String str = bf.readLine();
			if (str.charAt(0) <= '9') {
				int temp = Integer.parseInt(str);
				sb.append(list1.get(temp) + "\n");
			} else
				sb.append(list2.get(str) + "\n");

		}

		System.out.println(sb);

	}

}
