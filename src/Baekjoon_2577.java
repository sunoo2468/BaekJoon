import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Baekjoon_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        String ABC = String.valueOf(A*B*C);
        int[] abc = new int[10];
        for(int i=0; i<ABC.length(); i++){
            abc[Integer.parseInt(String.valueOf(ABC.charAt(i)))]++;
        }
        for(int value:abc){
            System.out.println(value);
        }
    }
}