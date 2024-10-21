import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 2;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(num+" ");
                num+=2;
                if(num>8){
                    num=2;
                }
            }
            System.out.println();
        }
    }
}