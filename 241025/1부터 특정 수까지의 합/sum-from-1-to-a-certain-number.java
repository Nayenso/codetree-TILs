import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.print(sum(n)/10);
    }
    public static int sum(int n){
        int total = 0;
        for(int i=1; i<=n; i++){
            total+=i;
        }
        return total;
    }
}