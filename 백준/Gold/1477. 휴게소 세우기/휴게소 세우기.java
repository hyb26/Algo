import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        
        int[] list = new int[N + 1];
        if(N!=0) {
        	st = new StringTokenizer(bf.readLine());
            for (int i = 0; i < N; i++) {
                list[i] = Integer.parseInt(st.nextToken());
            }
        }
        
        list[list.length - 1] = L;

        Arrays.sort(list);
//        System.out.println(Arrays.toString(list));

        int[] dist = new int[N + 1];

        dist[0] = list[0];
        
        int right = dist[0];
        
        if (list.length > 1) {
            for (int i = 1; i <= N; i++) {
                dist[i] = list[i] - list[i - 1];
                right = Math.max(right, dist[i]);
            }
        }
//        System.out.println(Arrays.toString(dist));

        int left = 1;
        int cnt, mid = 0;
        int result = 0;

        while (left <= right) {
            cnt = 0;
            mid = (left + right) / 2;
            for (int i = 0; i <= N; i++) {
                cnt += dist[i] / mid;
                if (dist[i] % mid != 0) {
                    cnt++;
                }
            }

            if(left == right) {
                result = mid;
                break;
            }

            if (cnt > N + 1 + M) {
                left = mid + 1;
            } else {
                right = mid;
                
            }

        }

        System.out.println(result);

    }

}