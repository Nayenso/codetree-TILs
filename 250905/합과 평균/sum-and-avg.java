import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, sum;
        double avg;

        A = sc.nextInt();
        B = sc.nextInt();
        sum = A+B;
        avg = sum/2.0;

        System.out.print(sum+" "+avg);
    }
}