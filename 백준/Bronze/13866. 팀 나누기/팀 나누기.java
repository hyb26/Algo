import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] list = new int[4];
		
		list[0]=sc.nextInt();
		list[1]=sc.nextInt();
		list[2]=sc.nextInt();
		list[3]=sc.nextInt();
		
		Arrays.sort(list);
		int a = list[0]+list[3];
		int b = list[1]+list[2];
		
		System.out.println(Math.abs(a-b));
	}

}