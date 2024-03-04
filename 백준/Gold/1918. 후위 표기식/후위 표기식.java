import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Stack<String> input = new Stack<>();

		String[] add = sc.nextLine().split("");
		int count = add.length;
		String result = "";

		input.add(" ");

		for (int re = 0; re < count; re++) {
			char temp = add[re].charAt(0);
			if ('A' <= temp && temp <= 'Z') {
				result = result + temp;
			} else {
				if ((input.peek().equals("*") && (add[re].equals("*")))
						|| (input.peek().equals("/") && add[re].equals("/"))
						|| (input.peek().equals("+") && add[re].equals("+"))
						|| (input.peek().equals("-") && add[re].equals("-"))) {
					while (input.peek().equals(add[re])) {
						result = result + input.pop();
					}
					input.add(add[re]);
				} else if ((input.peek().equals("*") && add[re].equals("/"))
						|| (input.peek().equals("/") && add[re].equals("*"))
						|| (input.peek().equals("+") && add[re].equals("-"))
						|| (input.peek().equals("-") && add[re].equals("+"))) {
					while ((input.peek().equals("*") && add[re].equals("/"))
							|| (input.peek().equals("/") && add[re].equals("*"))
							|| (input.peek().equals("+") && add[re].equals("-"))
							|| (input.peek().equals("-") && add[re].equals("+"))) {
						result = result + input.pop();
					}
					input.add(add[re]);
				}else if ((input.peek().equals("*") || input.peek().equals("/"))
						&& (add[re].equals("+") || add[re].equals("-"))) {
					while (input.size()!=1 && !input.peek().equals("(")) {
						result = result + input.pop();
					}
					input.add(add[re]);
				} else if (add[re].equals(")")) {
					while (!input.peek().equals("(")) {
						result = result + input.pop();
					}
					input.pop();
				} else
					input.add(add[re]);
			}
			if (re == count - 1) {
				while (input.size()!=1)
					result = result + input.pop();
			}
		}

		System.out.println(result);
	}

}
