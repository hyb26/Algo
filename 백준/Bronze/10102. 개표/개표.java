import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] score = {0,0};

        String list = br.readLine();

            for(int i = 0; i<list.length(); i++){
                if(list.charAt(i)=='A'){
                    score[0]++;
                }else if(list.charAt(i)=='B'){
                    score[1]++;
                }
            }
        if(score[0]>score[1]){
            System.out.println("A");
        }else if(score[0]<score[1]){
            System.out.println("B");
        }else {
            System.out.println("Tie");
        }

    }
}
