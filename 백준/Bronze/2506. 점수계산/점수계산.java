import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int l = 0;
        int result = 0;
        for(int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if(i==0){
                if(temp == 1){
                    l = 1;
                    result += l;
                }
            }else{
                if(temp == 0){
                    l = 0;
                }else{
                    l+=1;
                    result += l;
                }
            }
        }

        System.out.println(result);
    }
}
