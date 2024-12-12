import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] list = br.readLine().split(" ");

        BigInteger n = new BigInteger(list[0]);
        BigInteger m = new BigInteger(list[1]);

        System.out.println(n.add(m));
    }
}
