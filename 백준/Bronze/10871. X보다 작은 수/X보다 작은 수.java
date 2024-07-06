import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<n; i++) {
			int temp = sc.nextInt();
			if(temp<m) {
				sb.append(temp+" ");
			}
		}
        System.out.print(sb);
    }
}