import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> deq = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(bf.readLine());
		String str = " ";
		for(int i = 0; i<n; i++) {
			str = bf.readLine();
			if(str.charAt(0)=='1' || str.charAt(0)=='2'){
				String[] temp = str.split(" ");
				if(str.charAt(0)=='2') {
					deq.addLast(Integer.parseInt(temp[1]));
				}else {
					deq.addFirst(Integer.parseInt(temp[1]));
				}
			}else if(str.charAt(0)=='3' || str.charAt(0)=='4') {
				if(str.charAt(0)=='4') {
					if(deq.size()>0) {
						sb.append(deq.pollLast()+"\n");
					}else {
						sb.append(-1+"\n");
					}
					
				}else {
					if(deq.size()>0) {
						sb.append(deq.pollFirst()+"\n");
					}else {
						sb.append(-1+"\n");
					}
				}
			}else if (str.charAt(0)=='5') {
				sb.append(deq.size()+"\n");
			}else if (str.charAt(0)=='6') {
				if(deq.isEmpty()) {
					sb.append(1+"\n");
				}else {
					sb.append(0+"\n");
				}
			}else if (str.charAt(0)=='7') {
				if(deq.size()>0) {
					sb.append(deq.peekFirst()+"\n");
				}else {
					sb.append(-1+"\n");
				}
			}else if (str.charAt(0)=='8') {
				if(deq.size()>0) {
					sb.append(deq.peekLast()+"\n");
				}else {
					sb.append(-1+"\n");
				}
			}
		}
		System.out.println(sb);
		
	}

}
