import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i<n; i++) {
			String str = sc.nextLine();
			int cnt = 0;
			for(int j = 0; j<str.length(); j++) {
				
				if(str.charAt(j)=='A' || str.charAt(j)=='Q' ||
						str.charAt(j)=='R' || str.charAt(j)=='O' ||
						str.charAt(j)=='D' || str.charAt(j)=='P') {
					cnt++;
				}else if(str.charAt(j)=='B') {
					cnt+=2;
				}
					
			}
			System.out.println(cnt);
			
		}
	}

}
