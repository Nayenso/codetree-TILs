import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n*2+1; i++){
            for(int j=1; j<=n*2+1; j++){
                if(i%2==0){
                    if(j%2==0){
                        System.out.print("  ");
                    }else{
                        System.out.print("* ");
                    }
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}