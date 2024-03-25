import java.util.Scanner;

public class Main {
	static int cnt;
    static int r;
    static int c;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		r = sc.nextInt();
		c = sc.nextInt();
		
		int N = (int)Math.pow(2, n); 
		cnt = 0;

		System.out.println(find(N, 0, 0)-1);
		
//		for (int i = 0; i < N; i++) {
//			for (int j = 0; j < N; j++) {
//				System.out.print(map[i][j]);
//			}
//			System.out.println();
//		}
	}

	public static int find(int n, int tr, int tc) {
        
		if(n==1) {
			return 1;
		}
		int sum = 0;
		for(int i = tr; i<tr+n; i=i+n/2) {
			for(int j = tc; j<tc+n; j=j+n/2) {
				if(i<=r && r<i+n/2 && j<=c && c<j+n/2) {
					int y = find(n/2, i, j);
					return y + sum*(n/2)*(n/2);
				}
				else {
					sum++;
				}
				
			}
			
		}
		return sum;
	}

}
