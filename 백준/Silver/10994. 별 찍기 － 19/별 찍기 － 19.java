import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		if (n == 1) {
			System.out.println("*");
			System.exit(0);
		}

		char[][] result = draw(n);

		for (int i = 0; i < 4 * (n - 1) + 1; i++) {
			for (int j = 0; j < 4 * (n - 1) + 1; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	}

	public static char[][] draw(int n) {
		if (n == 2) {
			char[][] temp = { { '*', '*', '*', '*', '*' }, 
					{ '*', ' ', ' ', ' ', '*' }, { '*', ' ', '*', ' ', '*' },
					{ '*', ' ', ' ', ' ', '*' }, { '*', '*', '*', '*', '*' }};
			return temp;
		}
		
		char[][] temp = new char[4 * (n - 1) + 1][4 * (n - 1) + 1];
		char[][] extemp = draw(n-1);
		for(int i = 0; i<4 * (n - 1) + 1; i++) {
			for(int j = 0; j<4 * (n - 1) + 1; j++) {
				if(i>1 && j>1 && i<4 * (n - 1) -1 && j<4 * (n - 1) - 1) {
					temp[i][j]=extemp[i-2][j-2];
				}else if(i==0 || i==4 * (n - 1) || j==0 || j==4 * (n - 1)) {
					temp[i][j]='*';
				}else {
					temp[i][j]=' ';
				}
			}
		}
		return temp;
	}

}
