import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = 0, c=0;
        double avg;

        for(int i=a; i<=b; i++){
            if(i%5==0 || i%7==0){
                sum+=i;
                c++;
            }
        }
        avg = (double)sum/c;
        System.out.print(sum);
        System.out.printf(" %.1f", avg);
    }
}