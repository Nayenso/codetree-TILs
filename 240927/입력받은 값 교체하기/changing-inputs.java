import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.print(a+" "+b);
    }
}