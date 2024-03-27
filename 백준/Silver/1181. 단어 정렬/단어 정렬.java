import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.nextLine());

		HashSet<String> templist = new HashSet<>();
		for (int i = 0; i < N; i++) {
			templist.add(sc.nextLine());
		}
		List<String> list = new ArrayList<>();
		list.addAll(templist);
		Collections.sort(list);
		Collections.sort(list, (String a, String b) -> a.length() - b.length());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
