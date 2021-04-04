import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ex6_2 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Student[] arr = new Student[N];
        
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int score = Integer.parseInt(st.nextToken());
            arr[i] = new Student(name, score);
        }
        Arrays.sort(arr);

        for(Student s: arr){
            System.out.print(s.name + " ");
        }
        System.out.println();
    }
}

class Student implements Comparable<Student>{
    String name;
    int score;

    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }
    @Override
    public int compareTo(Student student){
        if(student.score > this.score){
            return -1;
        }
        return 1;
    }   
}