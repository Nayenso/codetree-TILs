import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char c = input.next().charAt(0);
        double a = input.nextDouble();
        double b = input.nextDouble();

        System.out.printf("%c\n%.2f\n%.2f",c,a,b);
    }
}