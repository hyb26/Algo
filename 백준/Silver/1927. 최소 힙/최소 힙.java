import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)-> a-b);
		for(int i = 0; i<n; i++) {
			int temp = sc.nextInt();
			if(temp == 0) {
				if(pq.isEmpty()) {
					sb.append(0+"\n");
				}else {
					sb.append(pq.poll()+"\n");
				}
			}else {
				pq.add(temp);
			}
		}
		
		System.out.println(sb);
		
	}

}
