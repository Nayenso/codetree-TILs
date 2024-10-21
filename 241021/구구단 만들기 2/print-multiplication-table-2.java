import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int t = 2;

        while(t<=8){
            for(int i=b; i>=a; i--){
                int t = 2;
                System.out.print(i+" * "+t+" = "+(i*t));
                if(i!=a){
                System.out.print(" / ");
                }
            }
            t+=2;
        }
    }
}