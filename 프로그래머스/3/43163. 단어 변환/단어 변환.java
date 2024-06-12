import java.util.*;

public class Word {
    int word;
    int depth;
    
    public Word(int word, int depth){
        this.word = word;
        this.depth = depth;
    }
    
}
class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        boolean can = false;
        int n = words.length;
        for(int i = 0; i<n; i++){
            if(target.equals(words[i])){
                can = true;
            }
        }
        
        if(can){
            Deque<Word> list = new ArrayDeque<>();
            list.add(new Word(n, 0));
            while(!list.isEmpty()){
                Word temp = list.poll();
                String tempword = "";
                if(temp.word!=n){
                    tempword = words[temp.word];
                }else{
                    tempword = begin;
                }
                
                if(tempword.equals(target)){
                    answer = temp.depth;
                    break;
                }
                
                for(int i = 0; i<n; i++){
                    int cnt = 0;
                    for(int j = 0; j<words[i].length(); j++){
                        if(tempword.charAt(j)!=words[i].charAt(j)){
                            cnt++;
                        }
                    }
                    if(cnt==1){
                        list.add(new Word(i, temp.depth+1));
                    }
                }
            }
            
        }
        
        return answer;
    }
}