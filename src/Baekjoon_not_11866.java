import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baekjoon_not_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken()) - 1;
        ArrayList<Integer> list = new ArrayList<Integer>(N);
        ArrayList<Integer> answer = new ArrayList<Integer>(N);
        int count = 0;
        int index = 0;
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }
        for (int i = 0; i < N; i++) {
            if (list.size() < K + 1) {
                while(!list.isEmpty()) {
                    if(list.size() == 1){
                        answer.add(list.get(0));
                        break;
                    }
                    if(index == list.size()-1) {
                        index=0;
                    }
                    count++;
                    if(count==6){
                        if(index>=1) {
                            for (int x = 0; x < index; x++) {
                                list.add(list.get(x));
                                list.remove(x);
                            }
                        }
                        answer.add(list.get(index));
                        list.remove(index);
                        System.out.println(list);
                        index=0;
                        count=0;
                        continue;
                    }
                    index++;
                }
                break;
            }
            answer.add(list.get(K));
            list.remove(K);
            for (int j = 0; j < K; j++) {
                int H = list.get(0);
                list.add(H);
                list.remove(0);
            }
        }
        sb.append("<");
        for(int key: answer){
            if(answer.get(answer.size()-1)==key)
                sb.append(key).append(">");
            else
                sb.append(key).append(", ");
        }
        System.out.println(sb);
    }
}
