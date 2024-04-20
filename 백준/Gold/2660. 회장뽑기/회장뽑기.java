import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int N;
	static List<List<Integer>> list;
	static int[] result;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		list = new ArrayList<>();
		
		for(int i = 0; i<N+1; i++) {
			list.add(new ArrayList<>());
		}
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a==-1 || b==-1)
				break;
			
			list.get(a).add(b);
			list.get(b).add(a);
		}
		
		result = new int[N+1];
		int min = 100;
		
		for(int i = 1; i<N+1; i++) {
			result[i] = check(i);
			min = Math.min(min, result[i]);
		}
		int mincnt = 0;
		for(int i = 1; i<N+1; i++) {
			if(result[i]==min)
				mincnt++;
		}
		System.out.println(min + " " + mincnt);
		for(int i = 1; i<N+1; i++) {
			if(result[i]==min)
				System.out.print(i+" ");
		}
		
		
	}
	public static int check(int i) {
		boolean[] visited = new boolean[N+1];
		Queue<int[]> find = new LinkedList<>();
		
		find.add(new int[] {i, 0});
		int cnt = 1;
		int tempresult = 0;
		visited[i]=true;
		
		while(!find.isEmpty() && cnt<N) {
			int[] temp = find.poll();
			for(int j = 0; j<list.get(temp[0]).size(); j++) {
				if(!visited[list.get(temp[0]).get(j)]) {
					visited[list.get(temp[0]).get(j)]=true;
					cnt++;
					find.add(new int[] {list.get(temp[0]).get(j), temp[1]+1});
					tempresult = temp[1]+1;
				}
			}
		}
		return tempresult;
		
	}

}
