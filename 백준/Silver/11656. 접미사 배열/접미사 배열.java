import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		StringBuilder sb = new StringBuilder();
		String[] list = new String[s.length()];
		
		for(int i = 0; i<s.length(); i++) {
			list[i]=s.substring(i);
		}
		Arrays.sort(list);
		
		for(int i = 0; i<s.length(); i++) {
			System.out.println(list[i]);
		}
	}

}
