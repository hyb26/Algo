import java.util.*;
class Solution {
    public int solution(int n, int[][] edge) {
                
        int answer = 0;
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b)-> a[1] - b[1]);
        boolean[] visited = new boolean[n+1];
        int cnt = 0;
        
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i<n+1; i++){
            list.add(new ArrayList<>());
        }
        
        for(int i = 0; i<edge.length; i++){
            list.get(edge[i][0]).add(edge[i][1]);
            list.get(edge[i][1]).add(edge[i][0]);
        }
        
        pq.add(new int[] {1, 0});
        while(!pq.isEmpty()){
            int[] temp = pq.poll();
            if(visited[temp[0]]){
                continue;
            }
            visited[temp[0]]=true;
            if(temp[1]>cnt){
                cnt = temp[1];
                answer = 1;
            }else if (temp[1]==cnt){
                answer++;
            }
            
            for(int i = 0; i<list.get(temp[0]).size(); i++){
                pq.add(new int[] {list.get(temp[0]).get(i), temp[1]+1});
            }
            
        }
        
        return answer;
    }
}