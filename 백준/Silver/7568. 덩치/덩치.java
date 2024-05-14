import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] list = new int[n][2];
		int[] result = new int[n];
		
		for(int i = 0; i<n; i++) {
			list[i][0] = sc.nextInt();
			list[i][1] = sc.nextInt();
			
			if(i==0) {
				continue;
			}else {
				for(int j = i-1; j>=0; j--) {
					if(list[i][0]>list[j][0] && list[i][1]>list[j][1]) {
						result[j]++;
					}else if(list[i][0]<list[j][0] && list[i][1]<list[j][1]) {
						result[i]++;
					}
				}
			}
			
		}
		for(int i = 0; i<n; i++) {
			System.out.print((result[i]+1)+" ");
		}
		
		
	}

}
