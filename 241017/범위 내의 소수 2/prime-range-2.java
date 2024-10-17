import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int cnt = 0;

        for(int i=n1; i<=n2; i++){
            int c = 0;
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    c++;
                }
            }
            if(c==2){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}