import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.print(num(a,b));
    }

    public static int num(int a, int b){
        int t = 1;
        for(int i=1; i<=b; i++){
            t*=a;
        }
        return t;
    }
}