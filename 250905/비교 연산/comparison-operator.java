import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A,B;

        A = sc.nextInt();
        B = sc.nextInt();
        
        System.out.println(A>=B?1:0);
        System.out.println(A>B?1:0);
        System.out.println(B>=A?1:0);
        System.out.println(B>A?1:0);
        System.out.println(A==B?1:0);
        System.out.println(A!=B?1:0);
    }
}