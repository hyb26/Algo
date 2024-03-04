import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int[] dr = {-1, 0, 1, 0};
		int[] dc = {0, 1, 0, -1};
		
		
		String trash = sc.nextLine();
		for(int tc = 0; tc<T; tc++) {
			int direc = 0;
			int r = 0;
			int c = 0;
			int maxr = 0;
			int maxc = 0;
			int minr = 0;
			int minc = 0;
			String[] method  = sc.nextLine().split("");
			for(int i = 0; i<method.length; i++) {
				if(method[i].equals("F")) {
					r = r + dr[direc];
					c = c + dc[direc];
				} else if(method[i].equals("B")) {
					r = r - dr[direc];
					c = c - dc[direc];
				} else if(method[i].equals("L")) {
					if(direc<3)
						direc++;
					else
						direc=0;
				} else {
					if(direc>0)
						direc--;
					else
						direc=3;
				}
				maxr = Math.max(maxr, r);
				maxc = Math.max(maxc, c);
				minr = Math.min(minr, r);
				minc = Math.min(minc, c);
			}
			
			int area = (maxr - minr) * (maxc - minc);
			System.out.println(area);
		}
		
	}

}
