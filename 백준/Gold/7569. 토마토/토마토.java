import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int[][][] box = new int[n][m][h];
		
		int yet = 0;
		int result = 0;
		Deque<int[]> list = new ArrayDeque<int[]>();
		
		for(int i = 0; i<h; i++) {
			for(int j = 0; j<n; j++) {
				st = new StringTokenizer(br.readLine());
				for(int k = 0; k<m; k++) {
					box[j][k][i]=Integer.parseInt(st.nextToken());
					if(box[j][k][i]==1) {
						list.add(new int[] {j, k, i, 0});
					}else if(box[j][k][i]==0) {
						yet++;
					}
				}
			}
		}
		
		if(yet!=0) {
			while(!list.isEmpty() ) {
				int[] temp = list.poll();
				
				int r = temp[0];
				int c = temp[1];
				int y = temp[2];
				int time = temp[3];
				
				result = Math.max(result, time);
				
				if(r-1>=0 && box[r-1][c][y]==0) {
					yet--;
					box[r-1][c][y]=1;
					list.add(new int[] {r-1, c, y, time+1});
				}
				if(r+1<n && box[r+1][c][y]==0) {
					yet--;
					box[r+1][c][y]=1;
					list.add(new int[] {r+1, c, y, time+1});
				}
				if(c-1>=0 && box[r][c-1][y]==0) {
					yet--;
					box[r][c-1][y]=1;
					list.add(new int[] {r, c-1, y, time+1});
				}
				if(c+1<m && box[r][c+1][y]==0) {
					yet--;
					box[r][c+1][y]=1;
					list.add(new int[] {r, c+1, y, time+1});
				}
				if(y-1>=0 && box[r][c][y-1]==0) {
					yet--;
					box[r][c][y-1]=1;
					list.add(new int[] {r, c, y-1, time+1});
				}
				if(y+1<h && box[r][c][y+1]==0) {
					yet--;
					box[r][c][y+1]=1;
					list.add(new int[] {r, c, y+1, time+1});
				}
			}
		}
		
		if(yet>0) {
			System.out.println(-1);
		}else {
			System.out.println(result);
		}
		
		
		
	}

}
