import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

//class meeting implements Comparable<meeting>{
//	int start;
//	int end;
//	public meeting() {
//		// TODO Auto-generated constructor stub
//	}
//	@Override
//	public int compareTo(meeting o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		List<int[]> list = new ArrayList<>();
		int resultcnt = 0;
		
		for(int n = 0; n<N; n++) {			
			list.add(new int[] {sc.nextInt(), sc.nextInt()});
		}
		
		Collections.sort(list, (int[] a, int[] b) -> a[1]-b[1]);
		Collections.sort(list, (int[] a, int[] b) -> a[0]-b[0]);
		
		int start = -1;
		int end = -1;
		
		for(int i= 0; i<N; i++) {
			int[] temp = list.get(i);
//			System.out.println(Arrays.toString(temp) + start + " " + end);
			if(temp[0]==start && start != end && temp[1]>end) {
				continue;
			}
			if(temp[0] != end && temp[1]<=end) {
				start = temp[0];
				end = temp[1];
				continue;
			}
			if(temp[0]>=end) {
				start = temp[0];
				end = temp[1];
				resultcnt++;
//				System.out.println(resultcnt);
			}
			
		}
		
		System.out.println(resultcnt);
		
	}
	
}
