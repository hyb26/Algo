import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Stack<Character> list = new Stack<>();
		while(!str.equals(".")) {
			for(int i = 0; i<str.length(); i++) {
				if(str.charAt(i)=='[' || str.charAt(i)=='(') {
					list.add(str.charAt(i));
				}else if (str.charAt(i)==')') {
					if(!list.isEmpty() && list.peek()=='(') {
						list.pop();
					}else 
						list.add(str.charAt(i));
				}else if(str.charAt(i)==']') {
					if(!list.isEmpty() && list.peek()=='[') {
						list.pop();
					}else 
						list.add(str.charAt(i));
				}
			}
			
			if(list.isEmpty()) {
				System.out.println("yes");
			}else {
				System.out.println("no");
				list.clear();
			}
			
			str = sc.nextLine();
		}
	}

}
