import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=0; i<2; i++){
            for(int j=0; j<n; j++){
                for(int t=0; t<n; t++){
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}