class Solution {
    public int solution(int n) {
        
        int answer = 0;
        if(n==2){
            answer = 3;
        }else if(n==4){
            answer = 11;
        }else if(n % 2 != 0 ){
            answer = 0;
        }else{
            long[] result = new long[n/2];
            result[0]=3;
            result[1]=11;
            for(int i = 2; i<n/2; i++){
                result[i]+=result[i-1]*3;
                for(int j = i-2; j>=0; j--){
                     result[i]+=(result[j]*2);
                     result[i]%=1000000007;
                }
                result[i]+=2;
                result[i]%=1000000007;
            }
            answer = (int)result[n/2-1];
        }
        
        return answer;
    }
}