import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        b+=a;
        a+=b;
        System.out.print(a+"\n"+b);
    }
}