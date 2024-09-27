import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println(a>=b?1:0);
        System.out.println(a>b?1:0);
        System.out.println(b>=a?1:0);
        System.out.println(b>a?1:0);

    }
}