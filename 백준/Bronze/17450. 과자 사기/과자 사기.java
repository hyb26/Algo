import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double[] list = new double[3];

        for(int i = 0; i<3; i++){
            String[] pw = br.readLine().split(" ");
            if(Integer.parseInt(pw[0])*10>=5000)
                list[i] = (double)(Integer.parseInt(pw[1])*10)/(Integer.parseInt(pw[0])*10-500);
            else
                list[i] = (double)(Integer.parseInt(pw[1])*10)/(Integer.parseInt(pw[0])*10);
        }

        if(list[0]>list[1] && list[0]>list[2]){
            System.out.println("S");
        }
        if(list[1]>list[0] && list[1]>list[2]){
            System.out.println("N");
        }
        if(list[2]>list[1] && list[2]>list[0]){
            System.out.println("U");
        }

    }
}
