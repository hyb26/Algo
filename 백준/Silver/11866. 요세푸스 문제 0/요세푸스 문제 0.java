import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		Deque<Integer> list = new ArrayDeque<>();
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		for(int i = 1; i<n+1; i++) {
			list.add(i);
		}
		
		while(list.size()>1) {
			for(int i = 0; i<k; i++) {
				list.addLast(list.pollFirst());
			}
			sb.append(list.pollLast()).append(", ");
		}
		sb.append(list.poll()).append(">");
		
		System.out.println(sb);
	}

}
