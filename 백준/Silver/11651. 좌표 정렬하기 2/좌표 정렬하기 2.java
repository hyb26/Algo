import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		ArrayList<Integer[]> list = new ArrayList<>();
		for(int n = 0; n<N; n++) {
			Integer[] temp = {sc.nextInt() , sc.nextInt()};
			list.add(temp);
		}
        Collections.sort(list, (Integer[] a, Integer[] b) -> a[0] - b[0]);
		Collections.sort(list, (Integer[] a, Integer[] b) -> a[1] - b[1]);
		
		
		for(int i = 0; i<N; i++) {
			System.out.println(list.get(i)[0] + " " + list.get(i)[1]);
		}
	}

}
