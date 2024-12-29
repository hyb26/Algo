import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int result = 2000;
        for(int i = 0; i<3; i++){
            int burger = sc.nextInt();
            if(result>burger){
                result = burger;
            }
        }

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1>num2){
            result += num2;
        }else{
            result += num1;
        }
        System.out.println(result-50);

    }
}
