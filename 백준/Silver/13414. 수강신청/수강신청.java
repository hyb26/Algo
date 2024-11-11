import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] temp1 = br.readLine().split(" ");

        int n = Integer.parseInt(temp1[0]);
        int m = Integer.parseInt(temp1[1]);

        LinkedHashSet<String> set = new LinkedHashSet<>();

        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            if (set.contains(s)) {
                set.remove(s);
            }
            set.add(s);
        }

        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (String student : set) {
            if (count >= n) break;
            sb.append(student).append("\n");
            count++;
        }

        System.out.println(sb.toString());

    }
}
