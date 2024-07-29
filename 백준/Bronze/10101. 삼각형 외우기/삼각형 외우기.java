import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] list = new int[3];
		list[0] = sc.nextInt();
		list[1] = sc.nextInt();
		list[2] = sc.nextInt();
		
		Arrays.sort(list);
		
		if(list[0]==list[1] && list[1]==list[2] && list[2]==60) {
			System.out.println("Equilateral");
		}else if(list[0]+list[1]+list[2]==180 && (list[0]==list[1] || list[1]==list[2])) {
			System.out.println("Isosceles");
		}else if(list[0]+list[1]+list[2]==180 && list[0]!=list[2]) {
			System.out.println("Scalene");
		}else {
			System.out.println("Error");
		}
		
	}

}
