import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class ex7_1_BinarySearch {

    public static boolean BinSearch(int start, int end, int target, int [] arr){
        if(start > end){
            return false;
        }
        int mid = (start + end) / 2;
        if(target == arr[mid]){
            return true;
        }
        else if(target < arr[mid]){
            return BinSearch(start, mid - 1, target, arr);
        }
        else{
            return BinSearch(mid + 1, end, target, arr);
        }
    }
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int m = Integer.parseInt(br.readLine());
        int[] find = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String[] ans = new String[m];
        Arrays.sort(arr);

        for(int i = 0; i < m; i++){
            if(BinSearch(0, n - 1, find[i],arr)){
                ans[i] = "yes";
            }
            else{
                ans[i] = "no";
            }
        }
        
        for(String s : ans){
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
