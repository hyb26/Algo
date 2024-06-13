import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)->{
			int a1 = 0;
			int b1 = 0;
			
			if(a<0) {
				a1 = -a;
			}
			else {
				a1 = a;
			}
			if(b<0) {
				b1 = -b;
			}
			else {
				b1 = b;
			}
			if(a1!=b1) {
				if(a1<b1) {
					return -1;					
				}else {
					return 1;
				}
			}
			else {
				if(a<b) {
					return -1;
				}else {
					return 1;
				}
			}
				
		});
		int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
			int x = sc.nextInt();
			if(x==0) {
				if(pq.isEmpty()) {
					System.out.println(0);
				}else {
					System.out.println(pq.poll());
				}
			}else {
				pq.add(x);
			}
		}
		
		
	}

}
