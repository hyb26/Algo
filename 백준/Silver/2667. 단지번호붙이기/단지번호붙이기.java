import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int N;
	static int[][] map;
	static ArrayList<Integer> apart;
	static int[] dr = {0, 0, 1, -1};
	static int[] dc = {1, -1, 0, 0};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = Integer.parseInt(sc.nextLine());
		
		map = new int[N][N];
		
		for(int i = 0; i<N; i++) {
			String[] str = sc.nextLine().split("");
			for(int j = 0; j<N; j++) {
				map[i][j]=Integer.parseInt(str[j]);
			}
		}
		
		apart = new ArrayList<>();
		
		find(0);
		
		Collections.sort(apart);
		
		System.out.println(apart.size());
		for(int i = 0; i<apart.size(); i++) {
			System.out.println(apart.get(i));
		}
		
	}
	public static void find(int depth) {
		for(int i = 0; i<N; i++) {
			for(int j = 0; j<N; j++) {
				int cnt = 0;
				if(map[i][j]!=0) { 
					Queue<Integer[]> count = new LinkedList<>();
					count.add(new Integer[] {i, j});
					map[i][j]=0;
					cnt++;
					while(!count.isEmpty()){
						Integer[] temp = count.poll();
						for(int d = 0; d<4; d++) {
							if(temp[0]+dr[d]>=0 && temp[0]+dr[d]<N && temp[1]+dc[d]>=0 && temp[1]+dc[d]<N && map[temp[0]+dr[d]][temp[1]+dc[d]]!=0) {
								cnt++;
								map[temp[0]+dr[d]][temp[1]+dc[d]]=0;
								count.add(new Integer[] {temp[0]+dr[d],temp[1]+dc[d]});
							}
						}
					}
				}
				if(cnt!=0)
					apart.add(cnt);
			}
		}
	}

}
