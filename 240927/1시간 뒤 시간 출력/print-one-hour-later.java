import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useDelimiter(":");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.print((a+1)+":"+b);
    }
}