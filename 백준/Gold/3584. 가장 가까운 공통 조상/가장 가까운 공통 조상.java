import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc = 0; tc<T; tc++) {
			int n = sc.nextInt();
			int result = 0;
			int[] list = new int[n+1];
			
			for(int i = 0; i<n-1; i++) {
				int par = sc.nextInt();
				int ch = sc.nextInt();
				list[ch]=par;
			}
			int a = sc.nextInt();
			int b = sc.nextInt();
			HashSet<Integer> find = new HashSet<>();
			int temp = a;
			while(true) {
				find.add(temp);
				if(list[temp]!=0)
					temp = list[temp];
				else {
					break;
				}
			}
			temp = b;
			while(true) {
				if(find.contains(temp)) {
					result = temp;
					break;
				}
				temp = list[temp];
			}
			System.out.println(result);
		}
	}

}
