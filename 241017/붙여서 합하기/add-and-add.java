import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        int n1 = Integer.parseInt(A+B);
        int n2 = Integer.parseInt(B+A);

        System.out.print(n1+n2);
    }
}