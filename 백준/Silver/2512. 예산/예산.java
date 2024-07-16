import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int total = 0;
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            total += arr[i];
        }

        int money = Integer.parseInt(br.readLine());
        Arrays.sort(arr);
        int result = 0;

        if(total <= money){
            result = arr[arr.length-1];
        }else{
            int cnt = arr.length;
            int start = 1;
            int end = arr[cnt-1];
            while(start<=end){
                int mid = (start+end)/2;
                int temp = 0;
                for(int i = 0; i < n; i++){
                    if(arr[i]>mid){
                        temp += (n-i)*mid;
                        break;
                    }
                    else{
                        temp += arr[i];
                    }
                }
                if(temp <= money){
                    result = mid;
                    start = mid+1;
                }else {
                    end = mid - 1;
                }
            }
        }
        System.out.println(result);

    }
}