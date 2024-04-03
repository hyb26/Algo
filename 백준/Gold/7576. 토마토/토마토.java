import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int[][] map;
	static int N;
	static int M;
	static int result;
	static int zerocnt;
	static int[] dr = {0, 0, 1, -1};
	static int[] dc = {1, -1, 0, 0};
	
	static Queue<int[]> list;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		M = sc.nextInt();
		N = sc.nextInt();
		
		map = new int[N][M];
		list = new LinkedList<>();
		zerocnt = 0;
		result = 0;
		
		for(int i = 0; i<N; i++) {
			for(int j = 0; j<M; j++) {
				map[i][j]=sc.nextInt();
				if(map[i][j]==1) {
					list.add(new int[] {i, j, 1});
				}
				if(map[i][j]==0) {
					zerocnt++;
				}
			}
		}
		
		bfs();
		
		
		if(zerocnt==0)System.out.println(result);
		else System.out.println(-1);
		
		
	}public static void bfs() {
		while (zerocnt!=0 && !list.isEmpty()) {
			int[] temp = list.poll();
			result = Math.max(result, temp[2]);
			for(int i = 0; i<4; i++) {
				int nr = temp[0]+dr[i];
				int nc = temp[1]+dc[i];
				if(nr<N && nr>=0 && nc<M && nc>=0 && map[nr][nc]==0) {
					zerocnt--;
					map[nr][nc]=1;
					list.add(new int[] {nr, nc, temp[2]+1});
				}
			}
			
		}
	}

}
