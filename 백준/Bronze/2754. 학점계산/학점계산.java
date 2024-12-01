import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String score = br.readLine();

        if(score.charAt(0)=='A'){
            if(score.charAt(1)=='+'){
                System.out.println("4.3");
            }else if(score.charAt(1)=='-'){
                System.out.println("3.7");
            }else{
                System.out.println("4.0");
            }
        }else if(score.charAt(0)=='B'){
            if(score.charAt(1)=='+'){
                System.out.println("3.3");
            }else if(score.charAt(1)=='-'){
                System.out.println("2.7");
            }else{
                System.out.println("3.0");
            }
        }else if(score.charAt(0)=='C'){
            if(score.charAt(1)=='+'){
                System.out.println("2.3");
            }else if(score.charAt(1)=='-'){
                System.out.println("1.7");
            }else{
                System.out.println("2.0");
            }
        }else if(score.charAt(0)=='D'){
            if(score.charAt(1)=='+'){
                System.out.println("1.3");
            }else if(score.charAt(1)=='-'){
                System.out.println("0.7");
            }else{
                System.out.println("1.0");
            }
        }else{
            System.out.println("0.0");
        }
    }
}
