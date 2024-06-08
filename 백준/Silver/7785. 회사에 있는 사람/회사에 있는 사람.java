import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		HashSet<String> list = new HashSet<>();
		
		
		for(int i = 0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String method = st.nextToken();
			
			if(method.equals("enter")) {
				list.add(name);
			}else {
				list.remove(name);
			}
		}
		List<String> result = new ArrayList<>(list);
		Collections.sort(result);
		StringBuilder sb = new StringBuilder();
		for(int i = result.size()-1; i>=0; i--) {
			sb.append(result.get(i)+"\n");
		}
		System.out.println(sb);
		
	}

}
