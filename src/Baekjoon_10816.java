import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Baekjoon_10816 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<String,Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N; i++){
            String input = st.nextToken();
            if(!map.containsKey(input)){
                map.put(input,1);
            }
            else{
                map.put(input, map.get(input)+1);
            }
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++){
            String value = st.nextToken();
            if(map.containsKey(value)){
                sb.append(map.get(value)).append(" ");
            }
            else{
                sb.append("0 ");
            }
        }
        System.out.println(sb);
    }
}