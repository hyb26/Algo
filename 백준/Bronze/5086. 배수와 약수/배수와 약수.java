import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        
        while(n!=m) {
            if(n/m >0 && n%m == 0) {
                System.out.println("multiple");
            }else if(m/n>0 && m%n==0){
                System.out.println("factor");
            } else {
                System.out.println("neither");
            }
            n = sc.nextInt();
            m = sc.nextInt();            
        }
        
    }
}
