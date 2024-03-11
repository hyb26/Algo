import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			String trash = sc.nextLine();

			ArrayList<String> list = new ArrayList<>();

			for (int i = 0; i < N; i++) {
				String str = sc.nextLine();
				list.add(str);
			}

//			System.out.println(list.toString());
			Collections.sort(list);
//			System.out.println(list.toString());

			oo: for (int i = 0; i < N; i++) {
				for (int j = i + 1; j < N; j++) {
					if (list.get(j).startsWith(list.get(i))) {
						System.out.println("NO");
						break oo;
					} else {
						break;

					}

				}

				if (i == N - 1) {
					System.out.println("YES");
				}
			}

		}

	}

}