import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt(), M = sc.nextInt(), D = sc.nextInt();
        boolean flag = isTrue(Y,M,D);
        
        if(flag){
            if(3<=M&&M<=5){
                System.out.print("Spring");
            }else if(6<=M&&M<=8){
                System.out.print("Summer");
            }else if(9<=M&&M<=11){
                System.out.print("Fall");
            }else{
                System.out.print("Winter");
            }
        }else{
            System.out.print(-1);
        }
    }

    public static boolean isUnYear(int year){
        if(year%4==0){
            return true;
        }
        if(year%4==0 && year%100==0){
            return false;
        }
        if(((year%4==0 && year%100==0) || year%400==0)){
            return true;
        }
        return false;
    }

    public static int isMonth(int year, int month){
        if(isUnYear(year)){
            if(month==2){
                return 29;
            }
            if(month==4||month==6||month==9||month==11){
                return 30;
            }
            return 31;
        }else{
            if(month==2){
                return 28;
            }
            if(month==4||month==6||month==9||month==11){
                return 30;
            }
            return 31;
        }
    }

    public static boolean isTrue(int year, int month, int day){
        return ((1<=month && month<=12) && 1<=day && day <= isMonth(year,month));
    }
}