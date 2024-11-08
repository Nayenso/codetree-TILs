import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        System.out.print(findMax(n, m));
    }

    public static int findMax(int n, int m){
        int r;
        int min = (n>m)?m:n;

        while(m>0){
            r = n%m;
            n = m;
            m = r;
        }
        return n;
    }
}