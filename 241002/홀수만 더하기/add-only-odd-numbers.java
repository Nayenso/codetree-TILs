import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;

        for(int i=0; i<n; i++){
            int num = input.nextInt();
            if(num%2!=0 && num%3==0){
                sum+=num;
            }
        }
        System.out.print(sum);
    }
}