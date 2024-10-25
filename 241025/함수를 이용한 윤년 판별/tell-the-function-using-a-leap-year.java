import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        System.out.print(isYear(y));
    }

    public static boolean isYear(int n){
        if(n%4!=0){
            return false;
        }
        if(n%100==0 && n%400!=0){
            return false;
        }
        return true;
    }
}