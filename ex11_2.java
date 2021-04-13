import java.util.Scanner;

public class ex11_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int res = 0;
        for(int i = 0; i < input.length(); i++){
            int now = input.charAt(i) - '0';
            res = Math.max(res + now, res * now);
        }
        System.out.println(res);
    }
}
