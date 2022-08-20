import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon_11866 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        for(int i=1; i<=N; i++){
            queue.add(i);
        }
        for(int x=0; x<N; x++){
            for(int i=0; i<K-1; i++){
                queue.add(queue.poll());
            }
            if(x==N-1){
                sb.append(queue.poll()).append(">");
                break;
            }
            sb.append(queue.poll()).append(", ");
        }
        System.out.println(sb);
    }
}
