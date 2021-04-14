import java.util.ArrayList;
import java.util.Scanner;

public class ex11_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m + 1];

        for(int i = 1; i <= n; i++){
            int w = sc.nextInt();
            arr[w]++;
        }
        
        int res = 0;
        for(int i = 1; i < m; i++){
            n -= arr[i];
            res += arr[i] * n;
        }

        System.out.println(res);
    }
}
