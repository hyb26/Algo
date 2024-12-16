import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] list = br.readLine().split(" ");

        int result = 0;

        for(int i = 0; i< list.length; i++){

            if(Integer.parseInt(list[i])>0){
                result++;
            }

        }

        System.out.println(result);

    }
}
