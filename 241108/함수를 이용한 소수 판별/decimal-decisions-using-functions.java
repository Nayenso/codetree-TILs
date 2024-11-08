import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.print(sum(a,b));
    }

    public static boolean flag(int n){
        int cnt = 0;

        for(int i=1; i*i<=n; i++){
            if(n%i==0){
                cnt++;
                if(i!=n/i){
                    cnt++;
                }
            }
        }
        if(cnt==2){
            return true;
        }
        return false;
    }

    public static int sum(int a, int b){
        int sum = 0;
        for(int i=a; i<=b; i++){
            if(flag(i)){
                sum+=i;
            }
        }
        return sum;
    }
}