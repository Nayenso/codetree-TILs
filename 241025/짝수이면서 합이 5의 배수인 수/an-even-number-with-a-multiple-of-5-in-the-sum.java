import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        yesNo(n);
    }

    public static void yesNo(int n){
        int a = n/10, b = n%10;
        if(n%2==0 && (a+b)%5==0){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}