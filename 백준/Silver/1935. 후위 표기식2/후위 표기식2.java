import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		
		String str = sc.nextLine();
		
		int[] alpha = new int[26];
		for(int i = 0; i<n; i++) {
			alpha[i]=Integer.parseInt(sc.nextLine());
		}
		
		Stack<Double> list = new Stack<>();
		
		for(int i = 0; i<str.length(); i++) {
			if('A'<=str.charAt(i) && str.charAt(i)<='Z') {
				list.add((double) alpha[str.charAt(i)-'A']);
			}
			if(str.charAt(i)=='*') {
				list.add(list.pop() * list.pop());
			}
			if(str.charAt(i)=='/') {
				double a = list.pop();
				double b = list.pop();
				list.add((double)b/a);
			}
			if(str.charAt(i)=='+') {
				list.add(list.pop() + list.pop());
			}
			if(str.charAt(i)=='-') {
				double a = list.pop();
				double b = list.pop();
				list.add(b-a);
			}
		}
		System.out.printf("%.2f", list.pop());
	}

}
