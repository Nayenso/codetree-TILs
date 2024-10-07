import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int re = 1;
        int a = input.nextInt();
        int b = input.nextInt();

        for(int i=a; i<=b; i++){
            re*=i;
        }
        System.out.print(re);
    }
}