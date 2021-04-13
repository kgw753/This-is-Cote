import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class City implements Comparable<City>{
    private int index;
    private int distance;
    public City(int index, int distance){
        this.index = index;
        this.distance = distance;
    }
    public int getIndex(){
        return index;
    }

    public int getDistance(){
        return distance;
    }

    @Override
    public int compareTo(City other){
        if (this.distance < other.distance) {
            return -1;
        }
        return 1;
    }
}
public class ex9_2 {
    public static final int INF = (int)1e9;
    public static int n, m, c;
    public static ArrayList<ArrayList<City>> graph = new ArrayList<ArrayList<City>>();;
    public static int[] d = new int[30001];

    public static void dijkstra(int start){
        PriorityQueue<City> pq = new PriorityQueue<>();
        pq.offer(new City(start, 0));
        d[start] = 0;

        while(!pq.isEmpty()){
            City city = pq.poll();
            int dist = city.getDistance();
            int now = city.getIndex();
            if(d[now] < dist){
                continue;
            }
            for(int i = 0; i < graph.get(now).size(); i++){
                int cost = d[now] + graph.get(now).get(i).getDistance();
                if(cost < d[graph.get(now).get(i).getIndex()]){
                    d[graph.get(now).get(i).getIndex()] = cost;
                    pq.offer(new City(graph.get(now).get(i).getIndex(), cost));
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        c = sc.nextInt();

        for(int i = 0; i <= n; i++){
            graph.add(new ArrayList<City>());
        }
        
        for(int i = 0; i < m; i++){
            int p = sc.nextInt();
            int q = sc.nextInt();
            int r = sc.nextInt();

            graph.get(p).add(new City(q, r));
        }

        Arrays.fill(d, INF);

        dijkstra(c);

        int num = 0;
        int time = 0;

        for(int i = 0; i < n; i++){
            if(d[i] == INF){
                continue;
            }
            num++;
            time = Math.max(d[i], time);
        }

        System.out.println(num + " " + time);
    }
}
