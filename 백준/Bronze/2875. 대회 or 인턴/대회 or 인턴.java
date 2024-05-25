
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		
		int n1 = n/2;
		while(true) {
			if((n-2*n1)<0 || (m-n1)<0 || (n-2*n1 + m - n1)<k) {
				n1--;
			}else {
				break;
			}
		}
		System.out.println(n1);
		
	}

}
