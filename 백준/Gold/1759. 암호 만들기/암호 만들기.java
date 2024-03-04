import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static char[] alpha;
	static int N;
	static int K;
	static String result;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt(); // 수열 요소 수
		K = sc.nextInt(); // 구하고자 하는 합의 값
		alpha = new char[K]; // 배열 생성
		result = null; // 경우의 수가 몇개인지 구해줄 변수
		String trash = sc.nextLine();

		String[] str = sc.nextLine().split(" ");
		for (int i = 0; i < K; i++) { // 배열 입력 받음
			alpha[i] = str[i].charAt(0);
		}
		
		Arrays.sort(alpha);

		boolean[] visited = new boolean[K]; // 방문했는지 확인 위해 불리안 배열

		make(0, "", visited, 0, 0, 0); // 조합 시작


	}
	
	public static void make(int i, String sum, boolean[] visited, int cnt, int checka, int checkb) {
//        System.out.println(sum);
		if(cnt == N && checka>0 && checkb>1) { // 만약 구하고자 하는 값과 같으면? 
            System.out.println(sum);
            return;
        }
         
        while(i<K) {
            if(!visited[i]) {
            	if(cnt!=0) {
            		char temp = sum.charAt(cnt-1);
            		if(Character.compare(temp, alpha[i])<0) {
            			if(alpha[i]=='a' || alpha[i]=='e' || alpha[i]=='i' || alpha[i]=='o' || alpha[i]=='u') {
            				visited[i]=true;
                            make(i+1, sum+alpha[i], visited, cnt+1, checka+1, checkb);
                            visited[i]=false;
            			}else {
            				visited[i]=true;
                            make(i+1, sum+alpha[i], visited, cnt+1, checka, checkb+1);
                            visited[i]=false;
            			}
            			
            		} else{
            			make(i+1, sum, visited, cnt, checka, checkb);
            		}
            		
            	}else {
            		if(alpha[i]=='a' || alpha[i]=='e' || alpha[i]=='i' || alpha[i]=='o' || alpha[i]=='u') {
        				visited[i]=true;
                        make(i+1, sum+alpha[i], visited, cnt+1, checka+1, checkb);
                        visited[i]=false;
        			}else {
        				visited[i]=true;
                        make(i+1, sum+alpha[i], visited, cnt+1, checka, checkb+1);
                        visited[i]=false;
        			}
            	}
                
            }
            i++;
        }
         
    }

}
