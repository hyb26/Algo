import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] score = {100, 100};

        for (int t = 0; t < n; t++) {
            String[] list = br.readLine().split(" ");
            if(Integer.parseInt(list[0])<Integer.parseInt(list[1])){
                score[0]-=Integer.parseInt(list[1]);
            }else if(Integer.parseInt(list[0])>Integer.parseInt(list[1])){
                score[1]-=Integer.parseInt(list[0]);
            }
        }
        System.out.println(score[0] + "\n" + score[1]);

    }
}
