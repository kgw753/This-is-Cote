import java.util.Arrays;
import java.util.Scanner;

public class floyd_warshall{
    public static final int INF = (int)1e9;
    public static int n, m;
    public static int[][] graph = new int[501][501];

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        for(int i = 0; i < 501; i++){
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
            int c = sc.nextInt();
            graph[a][b] = c;
        }

        for(int k = 1; k <= n; k++){
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= n; j++){
                    graph[i][j] = Math.min(graph[i][j], graph[i][k] + graph[k][j]);
                }
            }
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(graph[i][j] == INF){
                    System.out.print("INF ");
                }
                else{
                    System.out.print(graph[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}