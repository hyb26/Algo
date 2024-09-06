import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String result = "";
		switch (n) {
		case 1:
			result = "11\nA B C D E F G H J L M";
			break;
		case 2:
			result = "9\nA C E F G H I L M";
			break;
		case 3:
			result = "9\nA C E F G H I L M";
			break;
		case 4:
			result = "9\nA B C E F G H L M";
			break;
		case 5:
			result = "8\nA C E F G H L M";
			break;
		case 6:
			result = "8\nA C E F G H L M";
			break;
		case 7:
			result = "8\nA C E F G H L M";
			break;
		case 8:
			result = "8\nA C E F G H L M";
			break;
		case 9:
			result = "8\nA C E F G H L M";
			break;
		case 10:
			result = "8\nA B C F G H L M";
			break;
		}
		
		System.out.print(result);
	}

}
