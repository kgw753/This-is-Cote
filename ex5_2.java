import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class ex5_2 {
    public static int N;
    public static int M;
    public static int [][] cnt;

    public static int bfs(int n, int m){
        int [][] dnext = {
            {1, 0}, {-1, 0},
            {0, 1}, {0, -1} };
        Queue<int []> q = new LinkedList<>();
        q.offer(new int[]{n, m});
        while(!q.isEmpty()){
            int [] next = q.poll();
            int x = next[1];
            int y = next[0];

            for(int i = 0; i < dnext.length; i++){
                int dx = dnext[i][0];
                int dy = dnext[i][1];
                if(x + dx < 0 || x + dx >= M ||
                y + dy < 0 || y + dy >= N){
                    continue;
                }
                if(cnt[y + dy][x + dx] == 1){
                    q.offer(new int[]{y + dy, x + dx});
                    cnt[y + dy][x + dx] = cnt[y][x] + 1;
                }
            }
        }

        return cnt[N - 1][M - 1];
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = st.nextToken().charAt(0) - '0';
        M = st.nextToken().charAt(0) - '0';
        cnt = new int[N][M];
        for(int i = 0; i < N; i++){
            String str = br.readLine();
            for(int j = 0; j <M; j++){
                cnt[i][j] = str.charAt(j) - '0';
            }
        }
        System.out.println(bfs(0, 0));
    }
}
