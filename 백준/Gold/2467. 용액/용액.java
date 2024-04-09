import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] list = new int[N];
		for(int i = 0; i<N; i++) {
			list[i]=sc.nextInt();
		}
		int[] result = new int[2];
		int min = 2000000000;
		int left = 0;
		int right = N-1;
		while(left!=right) {
			int temp = list[left]+list[right];
			if(Math.abs(min)>Math.abs(temp)) {
				min = temp;
				result[0]=list[left];
				result[1]=list[right];
			}
			if(temp<0) {
				left++;
			}else if(temp>0) {
				right--;
			}
			else {
				break;
			}
			
		}
		
		System.out.println(result[0]+" "+result[1]);
		
		
	}

}
