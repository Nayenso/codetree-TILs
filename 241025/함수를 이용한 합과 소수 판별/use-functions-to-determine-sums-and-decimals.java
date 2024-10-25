import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int total = 0;

        for(int i=a; i<=b; i++){
            if(isdecimal(i) && isEven(i)){
                total++;
            }
        }
        System.out.print(total);
    }

    public static boolean isdecimal(int n){
        int cnt = 0;
        for(int i=1; i*i<=n; i++){
            if(n%i==0){
                cnt++;
                if(i!=n/i){
                    cnt++;
                }
            }
        }
        return (cnt==2)?true:false;
    }

    public static boolean isEven(int n){
        int cnt = 0;
        while(n>0){
            cnt+=n%10;
            n/=10;
        }
        return (cnt%2==0)?true:false;
    }
}