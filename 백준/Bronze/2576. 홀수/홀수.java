import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int min = 0;
        int sum = 0;

        for(int i = 0; i<7; i++){
            int temp = sc.nextInt();
            if(temp %2 == 0){
                continue;
            }
            if(min == 0 || temp<min){
                min = temp;
            }
            sum += temp;

        }
        if(sum==0){
            System.out.println(-1);
        }else{
            System.out.println(sum + "\n" + min);
        }
    }
}
