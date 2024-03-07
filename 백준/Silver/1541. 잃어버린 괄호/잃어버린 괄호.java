import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arr = sc.nextLine().split("");
		
		String temp = "";
		int sum = 0;
		int method = 1;
		
		Queue<Integer> list = new LinkedList<>(); 
		
		for(int i = 0; i<arr.length; i++) {
			//System.out.println(temp + " " + sum);
			if(arr[i].charAt(0)>='0') {
				temp+=arr[i];
			}
			
			else {
				if(method==1) {
					sum += Integer.parseInt(temp);
					temp = "";
				}else {
					sum -= Integer.parseInt(temp);
					temp= "";
				}
				if(arr[i].charAt(0)=='+') {
					if(method==1)
						method = 1;
					else {
						continue;
					}
				}else {
					method = 0;
				}
			}
			
			if(i==arr.length-1) {
				if(method==1) {
					sum += Integer.parseInt(temp);
				}else {
					sum -= Integer.parseInt(temp);
				}
			}
			
		}
		System.out.println(sum);
	}
	

}
