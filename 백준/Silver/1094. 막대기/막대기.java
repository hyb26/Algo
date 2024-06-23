import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int temp = n;
		int result = 0;
		while(temp > 0) {
			int i = 1;
			while(i<=temp) {
				i = i*2;
			}
			i = i/2;
			temp -= i;
			result++;
		}
		
		System.out.println(result);
		
		
	}

}
