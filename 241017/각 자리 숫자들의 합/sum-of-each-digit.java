import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String num = Integer.toString(n);
        int sum = 0;

        for(int i=0; i<num.length(); i++){
            sum += num.charAt(i)-'0';
        }
        System.out.print(sum);
    }
}