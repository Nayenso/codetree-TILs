import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int sum = 0, index = 0;
        double avg = 0;
        boolean flag = true;

        for(int i=0; i<10; i++){
            num[i] = sc.nextInt();
            if(num[i] >= 250){
                index = i;
                flag = false;
                break;
            }
        }

        if(flag == true){
            for(int i=0; i<10; i++){
                sum+=num[i];
            }
            avg = (double)sum/10;
        }else{
             for(int i=0; i<index; i++){
                sum+=num[i];
            }
            avg = (double)sum/index;
        }
        System.out.printf("%d %.1f", sum, avg);
    }
}