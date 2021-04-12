import java.util.Arrays;
import java.util.Scanner;

public class ex9_1{
    public static final int INF = (int)1e9;
    public static int n, m, x, k;
    public static int[][] graph = new int[101][101];

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for(int i = 0; i < 101; i++){
            Arrays.fill(graph[i], INF);
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == j) graph[i][j] = 0;
            }
        }


        for(int i = 0; i < m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        x = sc.nextInt();
        k = sc.nextInt();

        for(int t = 1; t <= n; t++){
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= n; j++){
                    graph[i][j] = Math.min(graph[i][j], graph[i][t] + graph[t][j]);
                }
            }
        }
        
        int distance = graph[1][k] + graph[k][x];

        if(distance >= INF){
            System.out.println(-1);
        }
        else{
            System.out.println(distance);
        }
    }
}