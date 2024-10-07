import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, cnt =0;
        double avg = 0;

        while(true){
            int age = input.nextInt();
            if(age<=19 || age >=30){
                break;
            }
            sum+=age;
            cnt++;
        }
        avg = (double)sum/cnt;

        System.out.printf("%.2f",avg);
    }
}