import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ex11_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] fear = new int[n];
        for(int i = 0; i < n; i++){
            fear[i] = sc.nextInt();
        }

        Arrays.sort(fear);

        int cnt = 0;
        int res = 0;

        for(int i = 0; i < n; i++){
            cnt++;
            if(cnt >= fear[i]){
                res++;
                cnt = 0;
            }
        }

        System.out.println(res);
    }
}