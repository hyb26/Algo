import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		
		int temp = a%b;
		int result = 0;
		for(int i = 0; i<n; i++) {
			result = (temp*10)/b;
			temp = (temp*10)%b;
		}
		
		System.out.println(result);
	}

}
