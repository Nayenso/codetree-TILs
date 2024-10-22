import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = 1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i%2==0){
                    System.out.print(t+" ");
                    if(j<n){
                        t+=2;
                    }else{
                        t++;
                    }
                }else{
                    System.out.print(t+" ");
                    if(j<n){
                        t++;
                    }else{
                        t+=2;
                    }
                }
            }
            System.out.println();
        }
    }
}