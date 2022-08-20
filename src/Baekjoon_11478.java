import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Baekjoon_11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();
        String S = br.readLine();

        for(int i=0; i<S.length(); i++){
            for(int j=i; j<S.length(); j++){
                if(!map.containsKey(S.substring(i, j+1))){
                    map.put(S.substring(i, j+1), 0);
                }
            }
        }
        System.out.println(map.size());
    }
}