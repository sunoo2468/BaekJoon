import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String alpha = br.readLine();
        alpha = alpha.toUpperCase();
        char[] list = alpha.toCharArray();
        Arrays.sort(list);

        char[] arr1 = new char[2];
        int[] arr2 = new int[2];
        int count = 0;
        arr1[0] = list[0];
        arr2[0] = 1;
        for(int i=0; i< list.length - 1; i++){
            if(list[i] == list[i+1]){
                arr1[count] = list[i];
                arr2[count]++;
            }
            else {
                if (count == 1 && (arr2[0] < arr2[1])) {
                    arr1[0] = arr1[1];
                    arr2[0] = arr2[1];
                    count = 0;
                } else if (count == 1 && i != list.length - 1){
                    arr1[1] = ' ';
                    arr2[1] = 0;
                    count = 0;
                }
                else if (list[i] != list[i + 1]) {
                    count++;
                    arr1[count] = list[i + 1];
                    arr2[count]++;
                }
            }
        }
        System.out.println(Arrays.toString(arr1)+" "+Arrays.toString(arr2));
        if(arr2[0]<arr2[1])
            System.out.println(arr1[1]);
        else if (arr2[0]>arr2[1])
            System.out.println(arr1[0]);
        else
            System.out.println("?");
    }
}
