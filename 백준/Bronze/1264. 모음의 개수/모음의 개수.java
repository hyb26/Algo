import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        char[] list = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};

        String now = sc.nextLine();

        while(!now.equals("#")){
            int result = 0;
            for(int i = 0; i<now.length(); i++) {
                for (int j = 0; j < list.length; j++) {
                    if (now.charAt(i) == list[j]) {
                        result++;
                    }
                }
            }
            System.out.println(result);
            now = sc.nextLine();
        }

    }
}
