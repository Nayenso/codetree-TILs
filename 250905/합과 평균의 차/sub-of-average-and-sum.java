import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b,c, sum;
        double avg;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        sum = a+b+c;
        avg = sum/3.0;

        System.out.println(sum);
        System.out.println((int)avg);
        System.out.println((int)(sum-avg));
    }
}