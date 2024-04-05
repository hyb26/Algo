import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int D = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		int exsize = 0;
		st = new StringTokenizer(bf.readLine());
		Stack<Integer> oven = new Stack<>();
		for(int i = 0; i<D; i++) {
			if (i == 0) {
				oven.add(Integer.parseInt(st.nextToken()));
				exsize = oven.peek();
			}else {
				int temp = Integer.parseInt(st.nextToken());
				if(temp>exsize) {
					oven.add(exsize);
				}else {
					oven.add(temp);
					exsize=temp;
				}
				
			}
			
		}
		st = new StringTokenizer(bf.readLine());
		Queue <Integer> pizza = new LinkedList<>();
		for(int i = 0; i<N; i++) {
			pizza.add(Integer.parseInt(st.nextToken()));
		}
		int i = D+1;
		int idx = 0;
		while(!oven.isEmpty() && !pizza.isEmpty()) {
			int tempsize = oven.pop();
			i--;
			if(tempsize>=pizza.peek()) {
				pizza.poll();
				idx = i;
			}
		}
		if(pizza.size()>0) {
			System.out.println(0);
		}else {
			System.out.println(idx);
		}
		
	}

}
