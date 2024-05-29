import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	static String n;
	static int end;
	static int start;
	static int[] tempminus;
	static int[] tempplus;
	static boolean[] num;
	static int min;
	static int max;
	static int result;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		start = 100;

		n = sc.nextLine();
		end = Integer.parseInt(n);
		tempminus = new int[n.length()];
		for (int i = 0; i < tempminus.length; i++) {
			tempminus[i] = n.charAt(i) - '0';
		}
		tempplus = new int[n.length()];
		for (int i = 0; i < tempplus.length; i++) {
			tempplus[i] = n.charAt(i) - '0';
		}

		int m = Integer.parseInt(sc.nextLine());
		num = new boolean[10];

		if(m!=0) {
			StringTokenizer st = new StringTokenizer(sc.nextLine());
			for (int i = 0; i < m; i++) {
				num[Integer.parseInt(st.nextToken())] = true;
			}
		}

		min = 10;
		max = -1;

		for (int i = 0; i < 10; i++) {
			if (num[i]) {
				continue;
			} else {
				if (min > i) {
					min = i;
				}
				if (max < i) {
					max = i;
				}
			}
		}
		
//		System.out.println(min + " " + max);

		result = Math.abs(start - end);
		int idx = -1;
		if (result != 0) {
			for (int i = 0; i < n.length(); i++) {
				if (num[n.charAt(i) - '0']) {
					idx = i;
					break;
				}
				if(i==n.length()-1) {
					result = Math.min(result, n.length());
				}
			}
			if(result==Math.abs(start - end) && idx!=-1) {
				plus(idx, 0);
				minus(idx, 0);
				
//				System.out.println("-" + Arrays.toString(tempminus));
//				System.out.println("+" + Arrays.toString(tempplus));
			}
		}
		
		if(!num[0]) {
			result = Math.min(result, end+1);
		}
		
		int plusresult = 987654321;
		int minusresult = 987654321;
		
		if(tempplus[0]!=-1) {
			plusresult = 0;
			for(int p = 0; p<tempplus.length; p++) {
				if(p==0 && tempplus[p]==0 && tempplus.length>1) {
					continue;
				}
				plusresult+=tempplus[p]*Math.pow(10,tempplus.length-1-p)+1;
				
			}
			plusresult=Math.abs(plusresult-end);
		}else {
			plusresult=987654321;
		}
		
		if(tempminus[0]!=-1) {
			minusresult = 0;
			for(int m1 = 0; m1<tempminus.length; m1++) {
				if(m1==0 && tempminus[m1]==0 && tempminus.length>1) {
					continue;
				}
				minusresult+=tempminus[m1]*Math.pow(10,tempminus.length-1-m1);
				minusresult-=1;
			}
			minusresult=Math.abs(minusresult-end);
		}else {
			minusresult=987654321;
		}
		
//		System.out.println(minusresult + " " + plusresult + " " + result);
		result = Math.min(result,Math.min(minusresult, plusresult));
		
		System.out.println(result);

	}

	public static void plus(int idx, int depth) {
		for (int i = n.charAt(idx) - '0'; i < 10; i++) {
			if(depth>0 && i == n.charAt(idx) - '0') {
				continue;
			}
			if (!num[i]) {
				tempplus[idx] = i;
				if (idx != n.length() - 1) {
					for (int k = idx + 1; k < n.length(); k++) {
						tempplus[k] = min;
					}
				}
				break;
			}
			if (i == 9) {
				if (idx > 0)
					plus(idx - 1, depth+1);
				else {
					tempplus = new int[n.length() + 1];
					oo: for (int k = 0; k < tempplus.length; k++) {
						if (k == 0) {
							if (min == 0) {
								if (max != 0) {
									for (int t = 1; t < 10; t++) {
										if (!num[t]) {
											tempplus[k] = t;
											continue oo;
										}
									}
								} else {
									for (int t = 0; t < tempplus.length; t++) {
										tempplus[t] = -1;
									}
									return;
								}
							}
						}
						tempplus[k] = min;
					}
				}
			}
		}
	}

	public static void minus(int idx, int depth) {
		for (int i = n.charAt(idx) - '0'; i >= 0; i--) {
			if(depth>0 && i == n.charAt(idx) - '0') {
				continue;
			}
			if (!num[i]) {
				tempminus[idx] = i;
				if (idx != n.length() - 1) {
					for (int k = idx + 1; k < n.length(); k++) {
						tempminus[k] = max;
					}
				}
				break;
			}
			if (i == 0) {
				if (idx > 0) {
//					System.out.println("한다잉");
					minus(idx - 1, depth+1);
				}
				else {
					if (n.length() != 1) {
						tempminus = new int[n.length() - 1];
						for (int k = 0; k < tempminus.length; k++) {
							if (k == 0) {
								if (max == 0) {
									for (int t = 0; t < tempminus.length; t++) {
										tempminus[t] = -1;
									}
									return;
								}
							}
							tempminus[k] = max;
						}
					}else {
						for (int t = 0; t < tempminus.length; t++) {
							tempminus[t] = -1;
						}
						return;
					}
				}
			}
		}
	}
}
