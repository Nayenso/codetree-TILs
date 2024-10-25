import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNum(n);
    }
    public static void printNum(int n){
        int c = 1;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print((c++)+" ");
                if(c>9){
                    c=1;
                }
            }
            System.out.println();
        }
    }
}