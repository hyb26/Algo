import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();

		StringBuilder sb = new StringBuilder();

		boolean[] list = new boolean[end+1];

		double endnum = Math.sqrt(end);

		for (int i = 2; i <= endnum; i++) {
			for (int j = start; j < end+1; j++) {
				if (i != j &&  j % i == 0) {
					list[j]=true;
				}

			}
		}
		
		for (int j = start; j < end+1; j++) {
			if(!list[j] && j!=1)
				sb.append(j+"\n");
		}
		System.out.println(sb);
	}
}