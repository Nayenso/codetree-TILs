import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.print(n*makeNum(n,m));
    }
    
    public static int makeNum(int n, int m){
        int r = 1;
        while(n%m!=0){
            r = n%m;
            n = m;
            m = r;
        }
        return m;
    }
}