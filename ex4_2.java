import java.util.Scanner;

public class ex4_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int res = 0;

        for(int i = 0; i < N + 1; i++){
            for(int j = 0; j < 60; j++){
                for(int k = 0; k < 60; k++){
                    if(i % 10 == 3 || j % 10 == 3 || j / 10 == 3
                    || k % 10 == 3 || k / 10 == 3){
                        res++;
                    }
                }
            }
        }

        System.out.println(res);
    }
}
