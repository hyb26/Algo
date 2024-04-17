import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] num = new int[N];
		int[] result = new int[N];
		int max = 1;
		int idx = 0;

		for (int i = 0; i < N; i++) {
			num[i] = (sc.nextInt());
		}

		for (int i = 0; i < N; i++) {
			result[i] = 1;
			for (int j = 0; j < i; j++) {
				if (num[i] > num[j] && result[j] + 1 > result[i]) {
					result[i] = result[j] + 1;
					if (result[i] > max) {
						max = result[i];
						idx = i;
					}
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		int resultcnt = max - 1;
		sb.append(num[idx]);
		
		for(int i = idx-1; i>=0; i--) {
			if(result[i] == resultcnt && num[i]<num[idx]) {
				sb.insert(0, num[i]+" ");
				resultcnt--;
			}
		}
		
		System.out.println(max);
		System.out.println(sb);

	}

}
