import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long s = sc.nextLong();
		
		long temp = (long) Math.sqrt(2*s);
		long temp2 = temp*(temp+1)/2;
		
//		System.out.println(temp + " " + temp2 + " " + (temp-1));
		
		if(s==temp2) {
			System.out.println(temp);
		}else if(temp2<s) {
			System.out.println(temp);
		}else {
			System.out.println(temp-1);
		}
	}
}
