import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] list = new int[n];
		for(int i = 0; i<n; i++) {
			list[i]=sc.nextInt();
		}
		int h = list[n-1];
		int max = 0;
		for(int i = n-1; i>=0; i--) {
			if(list[i]<h) {
				max = Math.max(max, h-list[i]);
			}else {
				h = list[i];
			}
		}
		System.out.println(max);
		
	}
}