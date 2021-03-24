import java.util.Scanner;

class ex3_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int[] coin = {500, 100, 50, 10};
        int res = 0;

        for(int i = 0; i < coin.length; i++){
            res += money / coin[i];
            money %= coin[i];
        }
        if(money != 0){
            System.out.println(-1);
        }
        else{
        System.out.println(res);
        }
    }
}