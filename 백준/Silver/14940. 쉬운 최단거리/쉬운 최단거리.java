import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int[] dr = {0, 0, 1, -1};
	static int[] dc = {1, -1, 0, 0};
	
	static int R;
	static int C;
	
	static int[][] map;
	static int[][] result;
	static Queue<Integer[]> now;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		R = sc.nextInt();
		C = sc.nextInt();
		StringBuilder sb= new StringBuilder();
		
		now = new LinkedList<>();	
		
		map = new int[R][C];
		result = new int[R][C];
		for(int i = 0; i<R; i++) {
			Arrays.fill(result[i], -1);
		}
		
		
		for(int i = 0; i<R; i++) {
			for(int j = 0; j<C; j++) {
				map[i][j]=sc.nextInt();
				if(map[i][j]==2) {
					now.add(new Integer[] {i, j, 0});
					result[i][j]=0;
				}
				if(map[i][j]==0)
					result[i][j]=0;
			}
		}
		
		bfs();
		
		for(int i = 0; i<R; i++) {
			for(int j = 0; j<C; j++) {
				sb.append(result[i][j] + " ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
	public static void bfs() {
		while(!now.isEmpty()){
			for(int d = 0; d<4; d++) {
				int nr = now.peek()[0]+dr[d];
				int nc = now.peek()[1]+dc[d];
				
				if(nr<R && nr>=0 && nc<C && nc>=0 && result[nr][nc]==-1 && map[nr][nc]==1) {
					result[nr][nc]=now.peek()[2]+1;
					now.add(new Integer[] {nr, nc, result[nr][nc]});
				}
			}
			now.poll();
		}
		
		
		
	}

}
