import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cnt = 0;
        for(; ;){
            if(cnt>3){
                break;
            }
            int n = input.nextInt();
            if(n%2==0){
                System.out.println(n/2);
                cnt++;
            }
        }
    }
}