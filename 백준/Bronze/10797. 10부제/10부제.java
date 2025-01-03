import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int result = 0;
        for(int i = 0; i<5; i++){
            int car = sc.nextInt();
            if(car == t){
                result++;
            }
        }
        System.out.println(result);

    }
}
