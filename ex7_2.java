import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class ex7_2 {
    public static int n;
    public static int m;

    public static int BinarySearch(int start, int end, int[] arr){
        int result = 0;
        while(start <= end){
            int mid = (start + end) / 2;
            long sum = 0;
           for(int i = 0; i < n; i++){
               if(arr[i] > mid){
                   sum += (arr[i] - mid);
               }
           }
           if(sum < m){
               end = mid - 1;
           }
           else{
               start = mid + 1;
               result = mid;
           }
       }
       return result;
    }
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String firstLine = br.readLine();
        n = Integer.parseInt(firstLine.split(" ")[0]);
        m = Integer.parseInt(firstLine.split(" ")[1]);
        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(arr);

        int start = arr[0];
        int end = arr[n - 1];
        System.out.println(BinarySearch(start, end, arr));
    }
}
