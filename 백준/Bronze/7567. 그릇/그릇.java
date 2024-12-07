import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String temp = br.readLine();
        char ex = temp.charAt(0);
        int result = 10;

        for(int i = 1; i<temp.length(); i++){
            if(ex == temp.charAt(i)){
                result += 5;
            }else{
                result +=10;
                ex = temp.charAt(i);
            }
            
        }
        System.out.println(result);
    }
}
