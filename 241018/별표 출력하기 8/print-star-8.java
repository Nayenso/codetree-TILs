import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = 1;

        for(int i=1; i<=n; i++){
            if(i%2!=0){
                System.out.print("*");
            }else{
                for(int j=1; j<=l*2; j++){
                    System.out.print("* ");
                }
                l++;
            }
            System.out.println();
        }
    }
}