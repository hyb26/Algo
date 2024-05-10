import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(bf.readLine());
		for(int tc = 0; tc<t; tc++) {
			int n = Integer.parseInt(bf.readLine());
			int result = n;
			int[] list = new int[n+1];
			for(int i = 0; i<n; i++) {
				StringTokenizer st = new StringTokenizer(bf.readLine());
				list[Integer.parseInt(st.nextToken())]=Integer.parseInt(st.nextToken());
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
