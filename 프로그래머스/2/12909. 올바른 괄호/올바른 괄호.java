import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        Deque<Integer> list = new ArrayDeque<>();
        
        for(int i = 0; i<s.length(); i++){

            if(s.charAt(i)=='('){
                list.add(1);
            }else{
                if(list.isEmpty()){
                    answer = false;
                    break;
                }
                if(list.peekFirst()==0){
                    answer = false;
                    break;
                }
                list.pollFirst();
            }
            
        }
        if(!list.isEmpty()){
            answer = false;
        }
        return answer;
    }
}