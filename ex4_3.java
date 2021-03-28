import java.util.Scanner;

public class ex4_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int x = (int)(input.charAt(0) - 'a');
        int y = (int)(input.charAt(1) - '1');

        int [][] knight = {{2, 1}, {2, -1}, 
                            {1, 2}, {1, -2},
                            {-1, 2}, {-1, -2},
                            {-2, 1}, {-2, -1}};
        int res = 8;

        for(int i = 0; i < knight.length; i++){
            int next_x = knight[i][0] + x;
            int next_y = knight[i][1] + y;

            if(next_x < 0 || next_x > 7 || next_y <0 || next_y > 7){
                res--;
            }
        }
        
        System.out.println(res);
    }
}
