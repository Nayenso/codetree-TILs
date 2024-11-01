import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a < 11 || (a==11 && b<11) || (a==11 && b==11 && c<11)){
            System.out.print(-1);
        }
        System.out.print(checkTime(a,b,c));
    }

    public static int checkTime(int day, int hour, int min){
        int time = 0;
        int Day = day-11;
        if(Day>0){
            time = (hour*60 + min) + (day-12)*24*60 + (24*60 - (11*60+11));
        }else{
            time = (hour*60+min)-(11*60+11);
        }
        return time;
    }
}