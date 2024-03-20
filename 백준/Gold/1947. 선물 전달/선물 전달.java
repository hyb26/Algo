import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		long[] num = new long[N + 1];

		for (int i = 2; i <= N; i++) {
			if (i % 2 == 0) {
				num[i] = num[i - 1] * i + 1;
			} else {
				num[i] = num[i - 1] * i - 1;
			}
			if(num[i]>1000000000) {
				num[i]%=1000000000;
			}
		}
		
		
		
		System.out.println(num[N]);

	}

}
