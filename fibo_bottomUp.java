import java.util.Scanner;

public class fibo_bottomUp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] cache = new long[n + 1];

        cache[1] = cache[2] = 1;

        for(int i = 3; i < n + 1; i++){
            cache[i] = cache[i - 1] + cache[i - 2];
        }

        System.out.println(cache[n]);
    }
}
