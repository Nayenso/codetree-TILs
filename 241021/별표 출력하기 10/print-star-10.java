import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int odd = 1, even = 1;

        for(int i=1; i<=n*2; i++){
            if(i%2!=0){
                for(int j=1; j<=odd; j++){
                    System.out.print("* ");
                }
                odd++;
            }else{
                for(int j=n; j>=even; j--){
                    System.out.print("* ");
                    
                }
                even++;
            }
            System.out.println();
        }
    }
}