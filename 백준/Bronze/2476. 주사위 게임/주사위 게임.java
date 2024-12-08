import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i < n; i++) {
            int score = 0;
            String[] scores = br.readLine().split(" ");
            int[] temp = new int[3];
            for (int j = 0; j < 3; j++) {
                temp[j] = Integer.parseInt(scores[j]);
            }
            

            if(temp[0]==temp[1] && temp[1]==temp[2]){
                score = temp[0]*1000 + 10000;
            }else if(temp[0]==temp[1]){
                score = temp[0]*100 + 1000;
            }else if(temp[0]==temp[2]){
                score = temp[0]*100 + 1000;
            }else if(temp[1]==temp[2]){
                score = temp[1]*100 + 1000;
            }else{
                score = Math.max(temp[1], Math.max(temp[2], temp[0]));
                score*=100;
            }
            result = Math.max(result, score);
        }
        System.out.println(result);
    }
}
