import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if(N>=80){
            System.out.println("pass");
        }else{
            int score = 80-N;
            System.out.println(score+" more score");
        }
    }
}