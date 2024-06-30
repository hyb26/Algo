import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		
		int[] list = new int[w];
		
		st = new StringTokenizer(br.readLine());
		
		int result = 0;
		int cnt1 = 0;
		int l = 0;
		int lidx = -1;
		boolean[] visited = new boolean[w];
		
		for(int i = 0; i<w; i++) {
			list[i] = Integer.parseInt(st.nextToken());
			if(i==0) {
				lidx = i;
				l = list[i];
				continue;
			}
			
			if(list[i]>=l) {
				for(int j = lidx; j<i; j++) {
					visited[j]=true;
				}
				result += cnt1;
				l = list[i];
				lidx = i;
				cnt1 = 0;
				
			}else {
				if(visited[i])
					continue;
				cnt1 += l-list[i];
			}
			
		}
//		System.out.println(result);
		l = 0;
		cnt1=0;
		for(int i = w-1; i>=0; i--) {			
			if(i==w-1) {
				lidx = i;
				l = list[i];
				continue;
			}
			
			if(list[i]>=l) {
				for(int j = lidx; j<i; j++) {
					visited[j]=true;
				}
				result += cnt1;
				l = list[i];
				lidx = i;
				cnt1 = 0;
				
			}else {
				if(visited[i])
					continue;
				cnt1 += l-list[i];
			}
		}
		
		System.out.println(result);
		
		
		
		
	}

}
