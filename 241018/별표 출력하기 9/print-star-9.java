import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t=1;

        for(int i=n; i>=1; i--){
            for(int j=i-1; j>=1; j--){
                System.out.print(" "+" ");
            }
            for(int k=1; k<=t; k++){
                System.out.print("*"+" ");
            }
            t+=2;
            System.out.println();
        }
    }
}