import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int cnt = 0, i = 1;

        while(n/i>=1){
            n /= i++;
            cnt++;
        }

        System.out.print(cnt+1);
    }
}