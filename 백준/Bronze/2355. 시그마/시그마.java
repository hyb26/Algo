import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();

        long result = (long)(n + m) * (long)(Math.max(n,m) - Math.min(n,m) + 1) / 2;

        System.out.println(result);
    }
}
