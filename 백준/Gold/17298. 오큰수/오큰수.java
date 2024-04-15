import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		Stack<int[]> list = new Stack<>();
		int[] result = new int[N];
		
		StringBuilder sb = new StringBuilder();
		 
		list.add(new int[] {sc.nextInt(), 0});
		
		for(int i = 1; i<N; i++) {
			int temp = sc.nextInt();
			while(!list.isEmpty()) {
				if(list.peek()[0] < temp) {
					result[list.peek()[1]]=temp;
					list.pop();
				}else {
					break;
				}
			}
			list.add(new int[] {temp, i});
		}
		while(!list.isEmpty()) {
			result[list.pop()[1]] = -1;
		}
		
		
		for(int i = 0; i<N; i++) {
			sb.append(result[i]+" ");
		}
		
		System.out.println(sb);
	}
}