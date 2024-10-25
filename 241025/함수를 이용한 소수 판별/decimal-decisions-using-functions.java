import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int sum = 0;

        for(int i=a; i<=b; i++){
            if(checkNum(i)){
                sum+=i;
            }
        }
        System.out.print(sum);
    }

    public static boolean checkNum(int n){
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
}