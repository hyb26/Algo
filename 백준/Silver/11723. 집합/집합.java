import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		boolean[] list = new boolean[21];
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i<n; i++) {
			String str = sc.nextLine();
			if(str.charAt(0)=='a' && str.charAt(1)=='d') {
				String[] temp = str.split(" ");
				list[Integer.parseInt(temp[1])]=true;
			}else if (str.charAt(0)=='r') {
				String[] temp = str.split(" ");
				list[Integer.parseInt(temp[1])]=false;
			}else if (str.charAt(0)=='c') {
				String[] temp = str.split(" ");
				if(list[Integer.parseInt(temp[1])]) {
					sb.append(1).append("\n");
				}else
					sb.append(0).append("\n");
			}else if (str.charAt(0)=='t') {
				String[] temp = str.split(" ");
				if(list[Integer.parseInt(temp[1])]) {
					list[Integer.parseInt(temp[1])]=false;
				}else
					list[Integer.parseInt(temp[1])]=true;
			}else if (str.charAt(0)=='e') {
				Arrays.fill(list, false);
			}else {
				Arrays.fill(list, true);
			}
		}
		System.out.println(sb);
	}

}