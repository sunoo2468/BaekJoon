import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String arr = br.readLine();
        if(arr.contains("LL"))
            arr = arr.replace("LL", "L");
        int cup = arr.length() + 1;
        if(cup >= N)
            System.out.println(N);
        else
            System.out.println(cup);
    }
}