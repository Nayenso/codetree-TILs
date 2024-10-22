import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            int cnt = 0;
            for(int j=1; j*j<=i; j++){
                if(i%j==0){
                    cnt++;
                    if(j != i/j){
                        cnt++;
                    }
                }
            }
            if(cnt==2){
                System.out.print(i+" ");
            }
        }
    }
}