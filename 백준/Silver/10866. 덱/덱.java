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
			if(str.charAt(0)=='p' && str.charAt(3)=='h'){
				String[] temp = str.split(" ");
				if(str.charAt(5)=='b') {
					deq.addLast(Integer.parseInt(temp[1]));
				}else {
					deq.addFirst(Integer.parseInt(temp[1]));
				}
			}else if(str.charAt(0)=='p' && str.charAt(2)=='p') {
				if(str.charAt(4)=='b') {
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
			}else if (str.charAt(0)=='s') {
				sb.append(deq.size()+"\n");
			}else if (str.charAt(0)=='e') {
				if(deq.isEmpty()) {
					sb.append(1+"\n");
				}else {
					sb.append(0+"\n");
				}
			}else if (str.charAt(0)=='f') {
				if(deq.size()>0) {
					sb.append(deq.peekFirst()+"\n");
				}else {
					sb.append(-1+"\n");
				}
			}else if (str.charAt(0)=='b') {
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
