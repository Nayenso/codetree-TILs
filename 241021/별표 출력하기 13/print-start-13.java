import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int odd1 = 1, even1 = 1;
        int odd2 = 1, even2 = 1;

        for(int i=1; i<=n*2; i++){
            if(i%2!=0){
                for(int j=n; j>=odd1; j--){
                    System.out.print("* ");
                }
                odd1++;
            }else{
                for(int j=1; j<=even1; j++){
                    System.out.print("* ");
                }
                even1++;
            }
            System.out.println();
        }
    }
}