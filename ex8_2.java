import java.util.Scanner;
import java.util.stream.Stream;

public class ex8_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int max = 0;
        for(int i = 3; i < n; i++){
            arr[i] = Math.max(arr[i] + arr[i - 2] , arr[i - 1]);
        }

        System.out.println(arr[n - 1]);

    }
}
