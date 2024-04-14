import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	static int K;
	static int N;
	static Stack<Integer> list;
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		list = new Stack<>();
		String[] num = sc.nextLine().split("");
		
		list.add(Integer.parseInt(num[0]));
		
		
		for(int i = 1; i<N; i++) {
//			System.out.println(list);
			int temp = Integer.parseInt(num[i]);
			if (K==0) {
				list.add(temp);
				continue;
			}
			if(list.peek()<temp) {
				check(temp);
			}
			list.add(temp);
		}	
		
		while(K>0) {
			list.pop();
			K--;
		}
		
		int size = list.size();
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(list.pop());
		
		for(int i = 1; i<size; i++) {
			sb.insert(0, list.pop());
		}
		
		System.out.println(sb);
		
	}
	public static void check(int temp) {
		while(K>0 && !list.isEmpty()) {
			if(list.peek()<temp) {
				list.pop();
				K--;
			}else {
				break;
			}
		}
	}

}
