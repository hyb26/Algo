import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] list = new int[n];
        int result = 1;

        for(int i = 0; i<n; i++){
            list[i] = Integer.parseInt(br.readLine());
        }
        int min = list[n-1];
        for(int i = n-2; i>=0; i--){
            if(list[i]>min ){
                min = list[i];
                result++;
            }
        }

        System.out.println(result);

    }
}
