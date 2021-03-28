import java.util.Scanner;

public class ex3_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int cnt = 0;
        while(true){
            int compare = (N / K) * K;
            cnt += N - compare;
            N = compare;
            if(N < K){
                break;
            } 
            cnt++;
            N /= K;
        }

        cnt += N - 1;
        System.out.println(cnt);
    }
}
