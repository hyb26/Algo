import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int tc = 0; tc<t; tc++) {
			int j = sc.nextInt();
			int n = sc.nextInt();
			int[] list = new int[n];
			for(int i = 0; i<n; i++) {
				 list[i]= sc.nextInt() * sc.nextInt();
			}
			
			Arrays.sort(list);
			
			int result = 0;
			for(int i = n-1; i>=0; i--) {
				if(j>0) {
					j-=list[i];
					result++;
				}else {
					break;
				}
			}
			System.out.println(result);
			
		}
	}

}
