import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		int[] num = new int[N];
		
		for(int i = 0; i<N; i++) {
			num[i]=Integer.parseInt(bf.readLine());
		}
		Arrays.sort(num);
		
		int except = (int)Math.round(N*0.15);
		int result = 0;
		
		for(int i = except; i<N-except; i++) {
			result+=num[i];
		}
		
		double res = (double)result/(N-2*except);
		
		System.out.println(Math.round(res));
		
	}

}
