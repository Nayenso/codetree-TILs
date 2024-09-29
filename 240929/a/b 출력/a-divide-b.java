import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        double re = (double)a/b;
        System.out.printf("%.20f", re);
    }
}