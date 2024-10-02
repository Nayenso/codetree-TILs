import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), sum = 0;
        for(int i = n; i<=100){
            sum += i;
        }
        System.out.print(sum);
    }
}