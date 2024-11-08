import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b = sc.nextInt();
        int total = 0;

        for(int i=a; i<=b; i++){
            if(sosu(i) && isEven(i)){
                total++;
            }
        }
        System.out.print(total);
    }

    public static boolean sosu(int n){
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

    public static boolean isEven(int n){
        int sum = 0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        if(sum%2==0){
            return true;
        }
        return false;
    }
}