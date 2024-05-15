import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int tc = 0; tc<t; tc++) {
			int n = sc.nextInt();
			int idx = sc.nextInt();
			int result = 0;
			
			Queue<int[]> list = new LinkedList<>();
			PriorityQueue<Integer> w = new PriorityQueue<>((Integer a, Integer b)-> b - a);
			
			for(int i = 0 ; i<n; i++) {
				int temp = sc.nextInt();
				list.add(new int[] {temp, i});
				w.add(temp);
			}
			
			while(!list.isEmpty()) {
				int[] temp = list.poll();
				
				if(temp[0]==w.peek()) {
					result++;
					if(temp[1]==idx) {
						System.out.println(result);
						break;
					}
					w.poll();
				}else {
					list.add(temp);
				}
			}
		}
		
		
	}

}
