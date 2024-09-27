import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
       int avg = (a+b+c)/3;
        System.out.printf("%d\n%.0f",a+b+c,avg);
    }
}