import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] second = {300, 60, 10};
        int t = Integer.parseInt(br.readLine());
        int[] result = new int[3];

        result[0] = t/second[0];
        t%=second[0];
        result[1] = t/second[1];
        t%=second[1];
        result[2] = t/second[2];
        t%=second[2];
        if(t>0){
            System.out.println(-1);
        }else{
            System.out.println(result[0] + " " + result[1] + " " + result[2]);
        }


    }
}
