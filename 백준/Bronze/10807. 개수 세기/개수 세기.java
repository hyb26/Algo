import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] list = new int[n];
		for(int i = 0; i<n; i++) {
			list[i]=sc.nextInt();
		}
		int x = sc.nextInt();
		int result = 0;
		for(int i = 0; i<n; i++) {
			if(list[i]==x) {
				result++;
			}
		}
		System.out.println(result);
		
	}

}
