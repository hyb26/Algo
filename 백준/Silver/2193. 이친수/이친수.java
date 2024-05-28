import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		long[] list = new long[n];
		for(int i = 0; i<n; i++) {
			if(i==0 || i==1) {
				list[i]=1;
			}
			else {
				list[i]=list[i-1]+list[i-2];
			}
		}
		System.out.println(list[n-1]);
	}

}
