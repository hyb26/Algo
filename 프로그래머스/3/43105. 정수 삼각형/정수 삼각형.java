import java.util.*;
class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        int n = triangle.length;
        int[][] dp = new int[n][2];
        for(int i = 0; i<n; i++){
            if(i==0){
                dp[0][0]=triangle[i][0];
                continue;
            }
            for(int j = 0; j<triangle[i].length; j++){
                if(j==0){
                    dp[j][1]=dp[j][0]+triangle[i][j];
                }else {
                    dp[j][1]=Math.max(dp[j-1][0], dp[j][0])+triangle[i][j];
                }
            }
            for(int k = 0; k<n; k++){
                dp[k][0]=dp[k][1];
            }
        }
        for(int i = 0; i<n; i++){
            answer=Math.max(answer, dp[i][0]);
        }
        
        return answer;
    }
}