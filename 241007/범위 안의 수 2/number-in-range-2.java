import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int cnt = 0;
        double avg = 0;
        for(int i=0; i<10; i++){
            int n = input.nextInt();
            if(0<=n && n<=200){
                sum+=n;
                cnt++;
            }
        }
        avg = (double)sum/cnt;
        System.out.printf("%d %.1f",sum,avg);
    }
}