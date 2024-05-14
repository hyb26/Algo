import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] result = new int[20000001];
		
//		HashSet<Integer> list = new HashSet<>();
		
		StringTokenizer st =  new StringTokenizer(br.readLine());
		
		for(int i = 0; i<n; i++) {
			int temp = Integer.parseInt(st.nextToken())+10000000;
			result[temp]++;
		}
		
		int m = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		st =  new StringTokenizer(br.readLine());
		
		for(int i = 0; i<m; i++) {
			int temp = Integer.parseInt(st.nextToken())+10000000;
			sb.append(result[temp]+" ");
		}
		System.out.println(sb);
	}

}
