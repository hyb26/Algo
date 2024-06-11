import java.util.Scanner;

public class Main {
	static int n;
	static int[][] map;
	static int[] result;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		map = new int[n][n];
		result = new int[2];
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				map[i][j]=sc.nextInt();
			}
		}
		
		find(0, 0, n);
		
		System.out.println(result[0] + "\n" + result[1]);
		
	}
	public static int find(int r, int c, int w) {
		if(w==1) {
			if(map[r][c]==0) {
				result[0]++;
			}else {
				result[1]++;
			}
			return map[r][c];
		}
		
		int t1 = find(r, c, w/2);
		int t2 = find(r+w/2, c, w/2);
		int t3 = find(r, c+w/2, w/2);
		int t4 = find(r+w/2, c+w/2, w/2);
		
		if(t1 == t2 && t2 == t3 && t3 == t4 && t1 != -1 ) {
			if(t1==0) {
				result[0]-=3;
			}else {
				result[1]-=3;
			}
			return t1;
		}else {
			return -1;
		}
		
	}

}