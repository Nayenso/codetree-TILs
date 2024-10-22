import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;

        for(int i=n; i>=1; i--){
            for(int j=0; j<n-i; j++){
                System.out.print("  ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(cnt+" ");
                cnt++;
                if(cnt>9){
                    cnt=1;
                }
            }
            System.out.println();
        }
    }
}