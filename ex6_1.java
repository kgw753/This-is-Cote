import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class ex6_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer[] arr = new Integer[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());

        for(int n : arr){
            System.out.print(n + " ");
        }
        System.out.println();
    }
}