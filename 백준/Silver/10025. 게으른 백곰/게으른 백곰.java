import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[][] list = new int[n][2];
        int max = 0;

        for(int i = 0; i<n; i++){
            list[i][1]=sc.nextInt();
            list[i][0]=sc.nextInt();
            max = Math.max(max, list[i][0]);
        }

        Arrays.sort(list, (int[] a, int[] b) -> a[0]-b[0]);
        long[] dp = new long[max+1];

        dp[list[0][0]]=list[0][1];
        for(int j = 1; j<n; j++){
            for(int x = list[j-1][0]+1; x<list[j][0]; x++){
                dp[x]=dp[list[j-1][0]];
            }
            dp[list[j][0]]=dp[list[j][0]-1]+list[j][1];
        }

        long result = 0;
        
        if(max<2*k){
            result = dp[max];
        }else{
            for(int i = 0; i<max-(2*k); i++){
                if(i==0){
                    long temp = dp[i+2*k];
                    result = Math.max(result, temp);
                }else{
                    long temp = dp[i+2*k]-dp[i-1];
                    result = Math.max(result, temp);
                }

            }
        }

        System.out.println(result);
    }
}
