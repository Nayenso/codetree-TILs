import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
            System.out.println();
        }
        for(int i=n-1; i>=1; i--){
            for(int j=i; j>=1; j--){
                 System.out.print("*");
            }
            System.out.println();
            System.out.println();
        }
    }
}