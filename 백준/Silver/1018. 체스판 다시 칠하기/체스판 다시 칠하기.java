import java.util.Arrays;
import java.util.Scanner;

public final class Main {
	static char[][] map;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		String trash = sc.nextLine();
		
		map = new char[N][M];
		
		for(int i = 0; i<N; i++) {
			String str = sc.nextLine();
			for(int j = 0; j<M; j++) {
				map[i][j]=str.charAt(j);
			}
		}
		
		int reresult = 100;
		
		for(int i = 0; i<=N-8; i++) {
			for(int j = 0; j<=M-8; j++) {
				reresult = Math.min(reresult, find(i,j));
			}
		}
		System.out.println(reresult);
		
	}
	public static int find(int i, int j) {
		char f = ' ';
		int result = 0;
		for (int r = i; r<i+8; r++) {
			if(r%2==0)
				f = 'W';
			else
				f = 'B';
			for (int c = j; c<j+8; c++) {
				if(c%2==0) {
					if(map[r][c]==f)
						continue;
					else
						result++;
				}
				else {
					if(map[r][c]!=f)
						continue;
					else
						result++;
				}
				
			}
		}
		return Math.min(result, 64-result);
	}

}
