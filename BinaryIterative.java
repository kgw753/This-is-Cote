import java.util.Scanner;
import java.util.stream.Stream;

public class BinaryIterative {

    public static int BinarySearch(int start, int end, int target, int[] arr){
        int mid;
        int res = -1;
        while(start <= end){
            mid = (start + end) / 2;
            if(target == arr[mid]){
                res = mid;
                break;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        sc.nextLine();

        String input = sc.nextLine();
        int [] arr = Stream.of(input.split(" ")).mapToInt(Integer::parseInt).toArray();

        int start = 0;
        int end = n - 1;
        int res = BinarySearch(start, end, target, arr);
        if(res == -1){
            System.out.println("찾는 원소가 없습니다.");
        }
        else{
            System.out.println(res);
        }
    }
}
