import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ex3_3 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] cards = new int[N][M];
        for(int i = 0; i < N; i++){
            StringTokenizer card_st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                cards[i][j] = Integer.parseInt(card_st.nextToken());
            }
        }

        for(int[] arr: cards){
            Arrays.sort(arr);
        }

        int max = 0;
        for(int i = 0; i < N; i++){
            max = Math.max(max, cards[i][0]);
        }
        System.out.println(max);
    }
}
