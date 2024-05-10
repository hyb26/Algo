import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int tc = 0; tc<t; tc++) {
			int n = sc.nextInt();
			int result = n;
			int[] list = new int[n+1];
			for(int i = 0; i<n; i++) {
				list[sc.nextInt()]=sc.nextInt();
			}
			int check = n+1;
			for(int i = 1; i<=n; i++) {
				if(list[i]<check){
					check = list[i];
				}else {
					result--;
				}
			}
			
			System.out.println(result);
		}
	}

}
