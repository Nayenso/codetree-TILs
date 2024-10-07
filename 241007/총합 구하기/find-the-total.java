import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = 0;
        for(int i = a; i<=b; i++){
            if(i%6==0 && i%8 != 0){
                sum+=i;
            }
        }
        System.out.print(sum);
    }
}