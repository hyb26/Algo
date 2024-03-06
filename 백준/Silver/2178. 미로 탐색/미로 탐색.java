import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[][] map;
	static int N;
	static int M;
	static int max;
	static boolean[][] visited;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Queue<Integer[]> go = new LinkedList<>();
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		max = 0;
		
		for(int n = 0; n<N; n++) {
			String[] str = br.readLine().split("");
			for(int m = 0; m<M; m++) {
				map[n][m]=Integer.parseInt(str[m]);
			}
		}
		
		visited = new boolean[N][M];
		visited[0][0]=true;
		Integer[] temp = {0, 0};
		
		go.add(temp);
		bfs(go);
		
		System.out.println(map[N-1][M-1]);
		
	}
	public static void bfs(Queue<Integer[]> go) {
		int[] dr = {0, 0, 1, -1};
		int[] dc = {1, -1, 0, 0};
		
		int cnt = 1;
		
		while(!go.isEmpty()) {
			Integer[] temp = go.poll();
			for(int d = 0; d<4; d++) {
				int nr = temp[0]+dr[d];
				int nc = temp[1]+dc[d];
				if(nr>=0 && nr<N && nc>=0 && nc<M && map[nr][nc]>0 && !visited[nr][nc]) {
					visited[nr][nc]=true;
					Integer[] temp2 = {nr, nc};
					map[nr][nc]=map[temp[0]][temp[1]]+1;
					go.add(temp2);
				}
			}
		}
		
	}

}
