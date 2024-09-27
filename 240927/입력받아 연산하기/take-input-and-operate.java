import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        a+=87;
        b%=10;

        System.out.print(a+"\n"+b);
    }
}