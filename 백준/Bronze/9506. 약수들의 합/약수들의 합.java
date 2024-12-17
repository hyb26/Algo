import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int now = sc.nextInt();
        while (now != -1) {
            int max = (int)Math.sqrt(now);
            int sum = 0;
            List<Integer> list = new ArrayList<>();
            for(int i = 1; i <= max; i++) {
                if(i == 1){
                    list.add(i);
                    sum += i;
                    continue;
                }
                if(now % i == 0) {
                    list.add(i);
                    sum+=i;
                    if(i*i != now){
                        list.add(now/i);
                        sum+=now/i;
                    }
                }
            }
            Collections.sort(list);
            if(sum == now){
                System.out.print(now + " = ");
                for(int i = 0; i < list.size()-1; i++) {
                    System.out.print(list.get(i) + " + ");
                }
                System.out.println(list.get(list.size()-1));
            }else{
                System.out.println(now + " is NOT perfect.");
            }


            now = sc.nextInt();
        }

    }
}
