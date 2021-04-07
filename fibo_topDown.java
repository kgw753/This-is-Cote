import java.util.Scanner;

public class fibo_topDown {
    public static long[] cache = new long[100];
    public static long fibo(int n){
        if(n > 2){
            if(cache[n] == 0){
                cache[n] = fibo(n - 1) + fibo(n - 2);
            }

            return cache[n];
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }
}
