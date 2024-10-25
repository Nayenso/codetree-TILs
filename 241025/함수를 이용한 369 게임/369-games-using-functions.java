import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int cnt = 0;

        for(int i=a; i<=b; i++){
            if(isThree(i)||checkNum(i)){
                cnt++;
            }
        }
        System.out.print(cnt);
    }

    public static boolean isThree(int n){
        return n%3==0;
    }

    public static boolean checkNum(int n){
        while(n>0){
            int c = n%10;
            if(c==3 || c==6 || c==9){
                return true;
            }
            n /= 10;
        }
        return false;
    }
}