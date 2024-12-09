import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int result = 0;
        
        for(int i = 0; i<n; i++) {
            String temp = br.readLine();
            if(temp.charAt(0)=='0'){
                result -= 1;
            }else{
                result += 1;
            }
        }

        if(result>0){
            System.out.println("Junhee is cute!");
        }else{
            System.out.println("Junhee is not cute!");
        }
    }
}
