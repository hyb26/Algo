import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		String t = br.readLine();

		int result = 0;
		StringBuilder sb = new StringBuilder();
		
		HashSet<String> word = new HashSet<>();
		Deque<String> list = new ArrayDeque<>();
		sb.append(t);
		word.add(t);
		list.add(sb.toString());
		

		while (s.length() <= t.length() && !list.isEmpty()) {
			sb.setLength(0);
			t = list.poll().toString();
			sb.append(t);
			if (t.equals(s)) {
				result = 1;
				break;
			} else if(s.length()<t.length()){
				if(sb.charAt(sb.length()-1)=='B') {
					sb.deleteCharAt(sb.length()-1);
					sb.reverse();
					if(!word.contains(sb.toString()))
						list.add(sb.toString());					
				}
				sb.setLength(0);
				sb.append(t);
				if(sb.charAt(sb.length()-1)=='A') {
					sb.deleteCharAt(sb.length()-1);
					if(!word.contains(sb.toString()))
						list.add(sb.toString());					
				}
				
			}
			
		}
		System.out.println(result);

	}

}
