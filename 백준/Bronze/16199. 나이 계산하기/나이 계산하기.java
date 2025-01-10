import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        int ny = sc.nextInt();
        int nm = sc.nextInt();
        int nd = sc.nextInt();

        int r1 = ny-y-1;
        int r2 = ny-y+1;
        int r3 = ny-y;

        if(nm>m || (nm==m && nd>=d)){
            r1++;
        }

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);


    }
}
