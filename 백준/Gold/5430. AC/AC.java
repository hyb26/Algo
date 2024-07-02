import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		oo : for(int t = 0; t<tc; t++) {
			String method = br.readLine();
			int n = Integer.parseInt(br.readLine());
			String num = br.readLine();
			num = num.substring(1, num.length()-1);
			String[] temp = num.split(",");
			Deque<Integer> list = new ArrayDeque<>();
			for(int i = 0; i<n; i++) {
				list.add(Integer.parseInt(temp[i]));
			}
			boolean type = false;
			for(int i = 0; i<method.length(); i++) {
				if(method.charAt(i)=='R') {
					type = !type;
				}
				else {
					if(list.isEmpty()) {
						sb.append("error"+"\n");
						continue oo;
					}else {
						if(type) {
							list.pollLast();	
						}else {
							list.pollFirst();
						}
					}
				}
			}
			sb.append("[");
				if(type) {
					while(!list.isEmpty()) {
						if(list.size()==1) {
							sb.append(list.pollLast());
							continue;
						}
						sb.append(list.pollLast()+",");
						
					}
				}else {
					while(!list.isEmpty()) {
						if(list.size()==1) {
							sb.append(list.pollFirst());
							continue;
						}
						sb.append(list.pollFirst()+",");
						
					}
					
				}
				
			
			sb.append("]").append("\n");
			
		}
		System.out.println(sb);
		
	}
	

}
