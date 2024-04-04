import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int D = sc.nextInt();
		int N = sc.nextInt();
		
		int exsize = 0;
		
		Stack<Integer> oven = new Stack<>();
		for(int i = 0; i<D; i++) {
			if (i == 0) {
				oven.add(sc.nextInt());
				exsize = oven.peek();
			}else {
				int temp = sc.nextInt();
				if(temp>exsize) {
					oven.add(exsize);
				}else {
					oven.add(temp);
					exsize=temp;
				}
				
			}
			
		}
		Queue <Integer> pizza = new LinkedList<>();
		for(int i = 0; i<N; i++) {
			pizza.add(sc.nextInt());
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
