import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 11;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(num+" ");
                num+=2;
            }
            num -= 4;
            System.out.println();
        }
    }
}