import java.util.Scanner;

public class Main {
	static String sen;
	static boolean[] visited;
	static StringBuilder sb;
	static int n;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		sen = sc.nextLine();
		n = sen.length();
		visited = new boolean[n];
		sb = new StringBuilder();
		find(0, n);
		System.out.println(sb);
		
	}
	public static void find(int start, int end) {
		if(start>=end) {
			return;
		}
		int idx = start;
		for(int i = start; i<end; i++) {
			if (sen.charAt(i)<sen.charAt(idx)) {
				idx = i;
			}
		}
		visited[idx]=true;
		for(int i = 0; i<n; i++) {
			if (visited[i]) {
				sb.append(Character.toString(sen.charAt(i)));
			}
		}
				
		sb.append("\n");
		
		find(idx+1, end);
		find(start, idx);
	}
	

}
