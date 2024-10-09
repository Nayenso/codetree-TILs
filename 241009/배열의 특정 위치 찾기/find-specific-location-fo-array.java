import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[10];
        int sum1=0, sum2=0, cnt=0;

        for(int i=0; i<10; i++){
            n[i] = sc.nextInt();
            if(n[i]%2==0){
                sum1+=n[i];
            }
            if(n[i]%3==0){
                sum2+=n[i];
                cnt++;
            }
        }

        System.out.printf("%d %.1f",sum1,(double)sum2/cnt);
    }
}