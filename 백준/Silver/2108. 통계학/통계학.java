import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int avg = 0;
		int[] list = new int[n];
		int[] cntlist = new int[8001];
		int cntmax = 0;
		int max = -4001;
		int min = 4001;
		for(int i = 0; i<n; i++) {
			int temp = sc.nextInt();
			avg+=temp;
			list[i]=temp;
			cntlist[temp+4000]++;
			if(cntlist[temp+4000]>cntmax)
				cntmax = cntlist[temp+4000];
			if(temp<min)
				min = temp;
			if(temp>max)
				max = temp;
		}
		List<Integer> maxcntlist = new ArrayList<>();
		for(int i = 0; i<8001; i++) {
			if(cntlist[i]==cntmax)
				maxcntlist.add(i-4000);
		}
		Arrays.sort(list);
		
		System.out.println(Math.round((double)avg/n));
		System.out.println(list[n/2]);
		if(maxcntlist.size()==1) {
			System.out.println(maxcntlist.get(0));
		}else {
			System.out.println(maxcntlist.get(1));
		}
		System.out.println(max-min);
	}

}
