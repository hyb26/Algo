import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();

        if(n<m){
            System.out.println(m-n-1);
            for(int i = 1; i<(m-n); i++){
                System.out.print((n+i)+" ");
            }
        }else if(n>m){
            System.out.println(n-m-1);
            for(int i = 1; i<(n-m); i++){
                System.out.print((m+i)+" ");
            }
        }else{
            System.out.println(0);
        }
    }
}
