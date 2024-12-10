import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int t = 0; t < n; t++) {
            String s = br.readLine();
            int result = 0;
            int l = 0;
            if(s.charAt(0)=='O'){
                result = 1;
                l = 1;
            }
            for(int i = 1; i < s.length(); i++) {
                if( s.charAt(i)=='O') {
                    l++;
                    result +=l;
                }else {
                    l = 0;
                }
            }
            System.out.println(result);
        }
    }
}

