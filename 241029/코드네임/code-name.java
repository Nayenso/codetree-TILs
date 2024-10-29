import java.util.*;

class code{
    char name;
    int score;

    public code(char name, int score){
        this.name = name;
        this.score = score;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        code[] arr = new code[5];
        int min = Integer.MAX_VALUE, index = -1;

        for(int i=0; i<5; i++){
            char c = sc.next().charAt(0);
            int s = sc.nextInt();

            arr[i] = new code(c, s);
            if(arr[i].score < min){
                min = arr[i].score;
                index = i;
            }
        }

        System.out.print(arr[index].name+" "+arr[index].score);
    }
}