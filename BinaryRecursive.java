import java.util.Scanner;
import java.util.stream.Stream;

public class BinaryRecursive {
    public static int BinarySearch(int start, int end, int target, int[] arr){
        if(start > end){
            return -1;
        }
        int mid = (start + end) / 2;
        
        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid] > target){
            return BinarySearch(start, mid - 1, target, arr);
        }
        else{
            return BinarySearch(mid + 1, end, target, arr);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        sc.nextLine();

        String input = sc.nextLine();
        int[] arr = Stream.of(input.split(" ")).mapToInt(Integer::parseInt).toArray();
        
        int res = BinarySearch(0, n - 1, target, arr);
        if(res == -1){
            System.out.println("찾는 원소가 없습니다.");
        }
        else{
            System.out.println(res);
        }
    }
}
