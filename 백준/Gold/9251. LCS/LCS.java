import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		int[] list1;
		int[] list2;
		
		list1 = new int[str1.length()];
		list2 = new int[str2.length()];
		for (int i = 0; i < list1.length; i++) {
			list1[i]=str1.charAt(i)-'A';
		}
		for (int i = 0; i < list2.length; i++) {
			list2[i]=str2.charAt(i)-'A';
		}
		
		int maxresult = 0;
		int[][] templist = new int[list1.length][list2.length];
		int tempmax = 0;

		for (int i = 0; i < list1.length; i++) {
			tempmax = 0;
			for (int j = 0; j < list2.length; j++) {
				if (i > 0 && j > 0)
					tempmax = Math.max(tempmax, templist[i-1][j - 1]);
				if (list1[i] == list2[j] && i == 0)
					templist[i][j] = 1;
				else if (list1[i] == list2[j] && i>0)
					templist[i][j] = Math.max(tempmax + 1, templist[i-1][j]);
				else if(i>0){
					templist[i][j] = templist[i-1][j];
				}
				
				maxresult = Math.max(maxresult, templist[i][j]);
				
			}
		}

		System.out.println(maxresult);

	}

}
