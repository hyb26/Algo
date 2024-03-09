import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer[]> leng = new ArrayList<>();
		int N = sc.nextInt();

		for (int i = 0; i < 6; i++) {
			int t1 = sc.nextInt();
			int t2 = sc.nextInt();
			Integer[] ts = { t1, t2 };
			leng.add(ts);
		}

		int i = 0;
		int j = 0;
		int orii = 0;
		int orij = 0;

		while (true) {
			if (leng.get(0)[0] == leng.get(2)[0] && leng.get(1)[0] == leng.get(3)[0]) {
				i = leng.get(1)[1];
				j = leng.get(2)[1];
				orii = leng.get(0)[1] + leng.get(2)[1];
				orij = leng.get(1)[1] + leng.get(3)[1];
				break;
			} else {
				Integer[] temp = leng.get(0);
				leng.remove(0);
				leng.add(temp);
			}
		}

		System.out.println((orii * orij - i * j) * N);

	}

}
