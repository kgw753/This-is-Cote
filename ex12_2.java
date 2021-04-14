import java.util.Scanner;

public class ex12_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        int num = 0;
        char[] alph = new char['Z' - 'A'];
        for(int i = 0; i < input.length(); i++){
            char now = input.charAt(i);
            if(now >= '0' && now <= '9'){
                num += now - '0';
                continue;
            }
            alph[now - 'A']++;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < alph.length; i++){
            for(int j = 0; j < alph[i]; j++){
                sb.append((char)(i + 'A'));
            }
        }
        if(num != 0){
            sb.append(Integer.toString(num));
        }
        System.out.println(sb.toString());
    }
}