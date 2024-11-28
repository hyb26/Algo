import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i<n; i++){
            int[] cnt = new int[26];
            String[] temp = br.readLine().split(" ");

            if(temp[0].length()!=temp[1].length()){
                System.out.println("Impossible");
                continue;
            }
            
            for(int l = 0; l<temp[0].length(); l++){
                cnt[temp[0].charAt(l) - 'a']++;
            }

            for(int l = 0; l<temp[1].length(); l++){
                cnt[temp[1].charAt(l) - 'a']--;
                if(cnt[temp[1].charAt(l) - 'a'] < 0){
                    System.out.println("Impossible");
                    break;
                }
                if(l==temp[1].length()-1){
                    System.out.println("Possible");
                }
            }
        }
    }
}
