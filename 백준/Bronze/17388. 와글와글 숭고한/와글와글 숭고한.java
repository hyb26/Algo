import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		int k = sc.nextInt();
		int h = sc.nextInt();
		
		if(s+k+h<100) {
			if(s<k && s<h) {
				System.out.println("Soongsil");
			}
			if(k<s && k<h) {
				System.out.println("Korea");
			}
			if(h<s && h<k) {
				System.out.println("Hanyang");
			}
		}
		else {
			System.out.println("OK");
		}
	}

}
