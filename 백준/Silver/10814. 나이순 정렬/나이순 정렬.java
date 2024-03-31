import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = Integer.parseInt(sc.nextLine());
		
		List<String[]> list = new ArrayList<>();
		for(int tc = 0; tc<T; tc++) {
			String[] temp = sc.nextLine().split(" ");
			String[] templist = new String[3];
			templist[0]=temp[0];
			templist[1]=temp[1];
			templist[2]=Integer.toString(tc);
			list.add(templist);
		}
		
		Collections.sort(list, (String[] a, String[] b)-> Integer.parseInt(a[2]) - Integer.parseInt(b[2]));
		Collections.sort(list, (String[] a, String[] b)-> Integer.parseInt(a[0]) - Integer.parseInt(b[0]));

		for(int i = 0; i<T; i++) {
			System.out.println(list.get(i)[0] + " " + list.get(i)[1]);
		}
		
	}

}
