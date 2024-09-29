import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int n = input.nextInt();

        for(int i= 0; i < n; i++){
            a+=n;
            System.out.println(a);
        }
    }
}