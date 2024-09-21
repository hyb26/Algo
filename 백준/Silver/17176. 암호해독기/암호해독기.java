import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		int n = Integer.parseInt(br.readLine());
		int[] list = new int[53];//소문자 65-90, 97-122
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i<n; i++) {
			list[Integer.parseInt(st.nextToken())]++;
		}
		String sentence = br.readLine();
		
		for(int i = 0; i<sentence.length(); i++) {
			if(sentence.charAt(i)==' ') {
				list[0]--;
			}else if(sentence.charAt(i)<='Z') {
				list[sentence.charAt(i)-'A'+1]--;
			}else {
				list[sentence.charAt(i)-'a'+27]--;
			}
		}
		String temp = "y";
		for(int i = 0; i<53; i++) {
			if(list[i]<0) {
				temp = "n";
			}
		}
		
		System.out.println(temp);
		
	}

}
