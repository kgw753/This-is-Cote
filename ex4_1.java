import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex4_1 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = 1, y = 1;
        int tx, ty;

        char[] moveType = {'L', 'R', 'U', 'D'};
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        while(st.hasMoreTokens()){
            char ch = st.nextToken().charAt(0); 
            tx = x;
            ty = y;

            for(int i = 0; i < moveType.length; i++){
                if(moveType[i] == ch){
                    tx += dx[i];
                    ty += dy[i];
                    if(tx >= 1 && tx <= N && ty >= 1 && ty <= N){
                        x = tx;
                        y = ty;
                        break;
                    }
                    else{
                        break;
                    }
                }
            }
        }
        System.out.println(y + " " + x);
    }
}
