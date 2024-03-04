import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int N;
	static int[] colidx;
	static int cnt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();

		colidx = new int[N+1];
		cnt = 0;

		find(1);
		System.out.println(cnt);
	}

	public static void find(int row) {
		if (row == N+1) {
			cnt++;
//			System.out.println(Arrays.toString(colidx));
			return;
		}
		
		for (int i = 1; i <= N; i++) {
			if(row==0) {
				colidx[i]=row;
				find(row+1);
				colidx[i]=0;
			}
			else {
				if(colidx[i]==0) {
					for (int j = 1; j <= N; j++) {
						if(j<N && colidx[j]!=0) {
							if(row-colidx[j]== Math.abs(j-i)) {
								break;
							}
							
						}
						if (j==N) {
							if(colidx[j]!=0 && row-colidx[j]== Math.abs(j-i)) {
								break;
							}
							colidx[i]=row;
							find(row+1);
							colidx[i]=0;
						}
						
					}
				}
			}
		}
	}

}
