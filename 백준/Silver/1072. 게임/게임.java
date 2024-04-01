import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextInt();
		long Y = sc.nextInt();
		
		long Z = (Y*100/X);
		long z = 1+Z;
		
		
		long result = -1;
		if(Z!=100 && z!=100) {
			result = ((X*z)-Y*100)/(100-z);
			if(((X*z)-Y*100)%(100-z)!=0) {
				result++;
			}
		}
		
		System.out.println(result);
	}
}
