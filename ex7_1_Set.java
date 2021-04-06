import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.stream.Stream;

public class ex7_1_Set {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int m = Integer.parseInt(br.readLine());
        int[] find = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < n; i++){
            set.add(arr[i]);
        }

        for(int i = 0; i < m; i++){
            if(set.contains(find[i])){
                System.out.print("yes ");
            }
            else{
                System.out.print("no ");
            }
        }
        System.out.println();
    }
}
