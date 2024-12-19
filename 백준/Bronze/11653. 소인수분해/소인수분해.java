import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> result = new ArrayList<>();
        int idx = 2;
        while(n>1){
            if(n%idx==0) {
                result.add(idx);
                n /= idx;
                idx = 2;
                continue;
            }
            idx++;
        }

        for(int i = 0; i<result.size(); i++){
            System.out.println(result.get(i));
        }

    }
}
