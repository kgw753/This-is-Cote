import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class ex7_1_CountingSort {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int m = Integer.parseInt(br.readLine());
        int[] find = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] cnt = new int[1000001];
        for(int i = 0; i < n; i++){
            cnt[arr[i]]++;
        }

        String[] ans = new String[m];
        for(int i = 0; i < m; i++){
            if(cnt[find[i]] == 0){
                ans[i] = "no";
            }
            else{
                ans[i] = "yes";
            }
        }

        for(String s: ans){
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
