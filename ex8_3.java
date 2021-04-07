import java.util.Scanner;

public class ex8_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];

        arr[1] = 1;
        arr[2] = 3;

        for(int i = 3; i < n + 1; i++){
           arr[i] = (arr[i - 1] + 2 * arr[i - 2]) % 796796; 
        }
        System.out.println(arr[n]);
    }
}
