import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        for(int tc = 0; tc<t; tc++){
            StringBuilder sb = new StringBuilder();
            
            int n = sc.nextInt();
            HashSet<Integer> list = new HashSet<>();
            for(int i = 0; i<n; i++){
                list.add(sc.nextInt());
            }
            int m = sc.nextInt();
            for(int i = 0; i<m; i++){
                int temp = sc.nextInt();
                if(list.contains(temp)){
                    sb.append(1).append("\n");
                }else{
                    sb.append(0).append("\n");
                }
            }
            System.out.print(sb);
        }
        
    }
}