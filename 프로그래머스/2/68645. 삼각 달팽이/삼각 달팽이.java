class Solution {
    public int[] solution(int n) {
        int[][] delta = {{1, 0}, {0, 1}, {-1, -1}};
        int[] answer = new int[n*(n+1)/2];
        int cnt = 1;
        int[][] list = new int[n][n];
        int r = -1;
        int c = 0;
        int method = 0;
        int l = n;
        while(l>0){
            for(int i = 0; i<l; i++){
                r+=delta[method][0];
                c+=delta[method][1];
                list[r][c]=cnt;
                cnt++;
            }
            l--;
            method++;
            method%=3;
        }
        int idx = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<i+1; j++){
                answer[idx]=list[i][j];
                idx++;
            }
            
        }
        
        return answer;
    }
}