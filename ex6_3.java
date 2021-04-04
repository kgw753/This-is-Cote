import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class ex6_3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        StringTokenizer arrA = new StringTokenizer(br.readLine());
        Integer[] A = new Integer[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(arrA.nextToken());
        }

        StringTokenizer arrB = new StringTokenizer(br.readLine());
        Integer[] B = new Integer[N];
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(arrB.nextToken());
        }

        Arrays.sort(A);
        Arrays.sort(B, Collections.reverseOrder());

        for(int i = 0; i < K; i++){
            if(A[i] < B[i]){
                Integer tmp = A[i];
                A[i] = B[i];
                B[i] = tmp;
            }
            else{
                break;
            }
        }
        int sum = 0;
        for(int i = 0; i < N; i++){
            sum += A[i];
        }
        System.out.println(sum);
        
    }
}
