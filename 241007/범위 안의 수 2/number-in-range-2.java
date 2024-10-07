import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        double avg = 0;
        for(int i=0; i<10; i++){
            int n = input.nextInt();
            sum+=n;
        }
        avg = (double)sum/10;
        System.out.printf("%d %.1f",sum,avg);
    }
}