import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int right = 0;
		
		int[] list = new int[M];
		for(int i = 0; i<M; i++) {
			list[i]=Integer.parseInt(bf.readLine());
			right = Math.max(right, list[i]);
		}
		
		Arrays.sort(list);
		int cnt = 0;
		int left = 1;
		int mid =(left+right)/2;
        int result = 0;
		while(left<=right) {
			cnt = 0;
			mid = (left+right)/2;
			for(int i = 0; i<M; i++) {
				cnt+=list[i]/mid;
				if(list[i]%mid!=0) {
					cnt++;
				}
			}
				if(cnt>N) {
					left=mid+1;
				}else {
					right=mid-1;
                    result = mid;
				}
			
			
		}
		
		System.out.println(result);
		
	}

}
