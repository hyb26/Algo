import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        long t = sc.nextLong();

        int n = sc.nextInt();
        long result = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            result += a*b;
        }
        if (result == t){
            System.out.println("Yes");
        }else
            System.out.println("No");
    }
}
