import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String x = sc.nextLine();
		int result = 0;
		
		while(x.length()>1) {
			int temp = 0;
			for(int i = 0; i<x.length(); i++) {
				temp += x.charAt(i)-'0';
			}
			result++;
			x = String.valueOf(temp);
		}
		System.out.println(result);
		if(Integer.parseInt(x)%3==0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
