import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int t = 0; t < n; t++) {
            int max = 0;
            String school = "";
            int sc = Integer.parseInt(br.readLine());
            for (int i = 0; i < sc; i++) {
                String[] list = br.readLine().split(" ");
                if(max<Integer.parseInt(list[1])){
                    school = list[0];
                    max = Integer.parseInt(list[1]);
                }
            }
            System.out.println(school);

        }

    }
}
