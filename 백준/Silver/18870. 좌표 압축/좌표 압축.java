import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> ori = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(bf.readLine());
		int[] result = new int[N];
		
		String str = bf.readLine();
		StringTokenizer st = new StringTokenizer(str);
		for(int i = 0; i<N; i++) {
			int temp = Integer.parseInt(st.nextToken());
			ori.add(temp);
			result[i]=temp;
		}
		
		Object[] sorted = ori.stream().sorted().toArray();
		
		for(int i = 0; i<N; i++) {
			sb.append(Arrays.binarySearch(sorted, result[i]) + " ");
		}
		
		System.out.println(sb);
		
	}

}
