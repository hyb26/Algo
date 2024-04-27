import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] list = new int[n];
		for(int i = 0; i<n; i++) {
			list[i]=sc.nextInt();
		}
		Arrays.sort(list);
		int result = 0;
		for(int i = 0; i<n; i++) {
			result+= list[i]*(n-i);
		}
		System.out.println(result);
		
	}

}
