import java.util.*;

public class Main {
    public static int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] week = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int total = countDay(m1,d1,m2,d2);
        System.out.print(week[(total % 7 + 7) % 7]);
    }

    public static int countDay(int m1, int d1, int m2, int d2){
        int t1 = 0, t2 = 0;

        for(int i=1; i<m1; i++){
            t1+=days[i];
        }
        t1+=d1;

        for(int i=1; i<m2; i++){
            t2+=days[i];
        }
        t2+=d2;

        return t2-t1;
    }
}