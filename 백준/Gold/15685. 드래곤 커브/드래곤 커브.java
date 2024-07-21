import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int[][] delta = {{1, 0}, {0, -1}, {-1, 0}, {0, 1}};
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[][] map = new int[101][101];
        
        for(int tc = 0; tc < n; tc++) {
            int originx = sc.nextInt();
            int originy = sc.nextInt();
            int d = sc.nextInt();
            int g = sc.nextInt();
            
            List<Integer> directions = new ArrayList<>();
            directions.add(d);
            
            // Generate directions for each generation
            for(int gen = 0; gen < g; gen++) {
                int size = directions.size();
                for(int i = size - 1; i >= 0; i--) {
                    directions.add((directions.get(i) + 1) % 4);
                }
            }
            
            // Mark the map with the dragon curve
            int x = originx;
            int y = originy;
            map[x][y] = 1;
            for(int dir : directions) {
                x += delta[dir][0];
                y += delta[dir][1];
                if(x >= 0 && x <= 100 && y >= 0 && y <= 100) {
                    map[x][y] = 1;
                }
            }
        }
        
        int result = 0;
        
        for(int i = 0; i < 100; i++) {
            for(int j = 0; j < 100; j++) {
                if(map[i][j] == 1 && map[i + 1][j] == 1 && map[i][j + 1] == 1 && map[i + 1][j + 1] == 1) {
                    result++;
                }
            }
        }
        
        System.out.println(result);
    }
}
