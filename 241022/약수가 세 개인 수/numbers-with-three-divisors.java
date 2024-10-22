import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int sum = 0;

        for(int i=start; i<=end; i++){
            int cnt = 0;
            for(int j=1; j*j<=i; j++){
                if(i%j==0){
                    cnt++;
                    if(j != i/j){
                        cnt++;
                    }
                }
            }
            if(cnt==3){
                sum++;
            }
        }
        System.out.print(sum);
    }
}