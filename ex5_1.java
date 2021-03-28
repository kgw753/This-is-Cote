import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex5_1 {
    public static boolean [][] arr;
    public static int N;
    public static int M;

    public static void dfs(int i, int j){
        if(i < 0 || i >= N || j < 0 || j >= M){
            return;
        }
        if(arr[i][j]){
            arr[i][j] = false;
            dfs(i + 1, j);
            dfs(i, j + 1);
            dfs(i - 1, j);
            dfs(i, j - 1);
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new boolean[N][M];
        for(int i = 0; i < N; i++){
            String str = br.readLine();
            for(int j = 0; j < M; j++){
                char ch = str.charAt(j);
                if(ch == '1'){
                    arr[i][j] = false;
                }else if(ch == '0'){
                    arr[i][j] = true;
                }
            }
        }

        int res = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(arr[i][j]){
                    dfs(i, j);
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}
