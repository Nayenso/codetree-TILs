import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int mid;
        if((a < b && b < c) || (c < b && b < a)){
            mid = b;
        }else if((a < c && c < b) || (b < c && c < a)){
            mid = c;
        }else if((b < a && a < c) || (c < a && a < b)){
            mid = a;
        }
        System.out.print(mid);
    }
}