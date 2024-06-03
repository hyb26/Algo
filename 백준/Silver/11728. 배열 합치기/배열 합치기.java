import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i<n+m; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i<n+m; i++) {
			sb.append(list.get(i)+" ");
		}
		
		System.out.println(sb);
	}

}
