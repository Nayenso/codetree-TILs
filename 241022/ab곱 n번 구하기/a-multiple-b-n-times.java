import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int s = 1;
            for(int j=a; j<=b; j++){
                s*=j;
            }
            System.out.println(s);
        }
    }
}