import java.util.ArrayList;
import java.util.Scanner;

class Ball{
    public int index;
    public int weight;

    public Ball(int index, int weight){
        this.index = index;
        this.weight = weight;
    }
}

public class ex11_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Ball> arr = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            int w = sc.nextInt();
            arr.add(new Ball(i, w));
        }
        
        int c = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr.get(i).weight == arr.get(j).weight) continue;
                c++;
            }
        }

        System.out.println(c);
    }
}
