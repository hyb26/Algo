import java.util.*;
class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        boolean[] visited = new boolean[n];
        Deque<Integer> list = new ArrayDeque<>();
        
        for(int i = 0; i<n; i++){
            if(visited[i]){
                continue;
            }
            answer++;
            list.add(i);
            visited[i]=true;
            while(!list.isEmpty()){
                int temp = list.poll();
                for(int j = 0; j<n; j++){
                    if(!visited[j] && computers[temp][j]==1){
                        visited[j]=true;
                        list.add(j);
                    }
                }
            }
        }
        
        return answer;
    }
}