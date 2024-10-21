import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int re = 1;
        while(re<=9){
            for(int i=b; i>=a; i-=2){
                System.out.print(i+" * "+re+" = "+i*re);
                if(i!=a){
                    System.out.print(" / ");
                }
            }
            re++;
            System.out.println();
        }

    }
}