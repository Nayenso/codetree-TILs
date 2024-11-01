import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
                        //1   2   3   4   5   6   7   8   9   10  11 12
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if(m1 == m2){
            System.out.print(d2-d1+1);
        }else{
            int answer = days[m1]-d1+1 + d2;
            for(int i=m1+1; i<m2; i++){
                answer += days[i];
            }
            System.out.print(answer);
        }
    }
}