import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int N = Integer.parseInt(br.readLine());
		int[] ca= new int[10001];
		int[] arr = new int[N];
		
		for(int i = 0 ; i < N ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 0 ; i < arr.length ; i++) {
			ca[arr[i]]++;
		}
		
		for(int i = 0 ; i < 10001 ; i++) {
			while(ca[i] > 0) {
				bw.write(i + "\n");	
				ca[i]--;
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}

}