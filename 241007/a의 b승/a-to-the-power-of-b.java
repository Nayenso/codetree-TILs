import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int re = 1;
        for(int i = 0; i<b; i++){
            re *= a;
        }
        System.out.print(re);
    }
}