import java.util.Scanner;

public class ex8_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] cache = new int[num + 1];
        cache[1] = 0;
        for (int i = 2; i < num + 1; i++) {
            int cnt = 30001;
            if (i % 5 == 0) {
                cnt = Math.min(cnt, 1 + cache[i / 5]);
            }
            if (i % 3 == 0) {
                cnt = Math.min(cnt, 1 + cache[i / 3]);
            }
            if (i % 2 == 0) {
                cnt = Math.min(cnt, 1 + cache[i / 2]);
            }

            cnt = Math.min(cnt, 1 + cache[i - 1]);
            cache[i] = cnt;
        }

        System.out.println(cache[num]);
    }
}
