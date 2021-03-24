import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class ex3_2 {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Integer[] numbers = new Integer[N];
        StringTokenizer numbers_st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            numbers[i] = Integer.parseInt(numbers_st.nextToken());
        }
        Arrays.sort(numbers, new Comparator<Integer>(){
            @Override
            public int compare(Integer n1, Integer n2){
                return n2 - n1;
            }
        });

        int cnt = 0;
        int res = 0;
        for(int i = 0; i < M; i++){
            if(cnt < K){
                cnt++;
                res += numbers[0];
            }
            else{
                cnt = 0;
                res += numbers[1];
            }
        }
        System.out.println(res);
    }
}
