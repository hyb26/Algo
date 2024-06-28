import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int zero = 0;
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			int temp = Integer.parseInt(st.nextToken());
			if (temp < 0) {
				list1.add(temp);
			} else if (temp > 0) {
				list2.add(temp);
			} else {
				zero++;
			}
		}

		int result = 200000000;
		int ex = 200000000;
		int n1 = list1.size();
		int n2 = list2.size();

		if (n1 == 0 && n2!=0) {
			if (zero == 0) {
				result = list2.get(0) + list2.get(1);
			} else {
				result = list2.get(0);
			}
		} else if (n2 == 0 && n1!=0) {
			if (zero == 0) {
				result = list1.get(n1 - 1) + list1.get(n1 - 2);
			} else {
				result = list1.get(n1 - 1);
			}
		} else if(n1==0 && n2==0) {
			result = 0;
		}
		else {
			int s1 = n1 - 1;
			int s2 = 0;
			
			if(n1>1) {
				result = Math.min(Math.abs(list1.get(n1-1)+list1.get(n1-2)), Math.abs(result));
				if(result == Math.abs(list1.get(n1-1)+list1.get(n1-2))) {
					result = list1.get(n1-1)+list1.get(n1-2);
				}
			}
			if(n2>1) {
				result = Math.min(Math.abs(list2.get(0)+list2.get(1)), Math.abs(result));
				if(result == Math.abs(list2.get(0)+list2.get(1))) {
					result = list2.get(0)+list2.get(1);
				}
			}
			if(zero>0) {
				result = Math.min(Math.abs(result), Math.min(Math.abs(list1.get(n1-1)), Math.abs(list2.get(0))));
				if(result == Math.abs(list1.get(n1-1)) ) {
					result = list1.get(n1-1);
				}
				else if(result == Math.abs(list2.get(0)) ) {
					result = list2.get(0);
				}
			}
			
			
			while (s1 >= 0 && s2 < n2) {
				int temp = list1.get(s1) + list2.get(s2);

				if (Math.abs(temp) < Math.abs(result)) {
					result = temp;
				}
				if (temp > 0) {
					s1--;
				} else if (temp < 0) {
					s2++;
				} else {
					break;
				}
				ex = temp;
			}
			
		}
		
		System.out.println(result);
	}

}
