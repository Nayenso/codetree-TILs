import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = 0;

        for(int i=n; i>=1; i--){
            for(int j=i; j>=1; j--){
                System.out.print("*");
            }
            for(int k=0; k<t; k++){
                System.out.print(" ");
            }
            for(int l=1; l<=i; l++){
                System.out.print("*");
            }
            t+=2;
            System.out.println();
        }
    }
}