import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();

        int cooking = sc.nextInt();

        minute+=cooking;
        if(minute/60>0){
            hour+=minute/60;
            minute = minute%60;
        }
        hour=hour%24;

        System.out.println(hour + " " + minute);



    }
}
