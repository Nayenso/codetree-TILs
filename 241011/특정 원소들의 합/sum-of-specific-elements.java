import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] n = new int[4][4];
        int sum = 0;

        for(int i=0; i<n.length; i++){
            for(int j=0; j<n[i].length; j++){
               n[i][j] = sc.nextInt(); 
            }
        }

        for(int i=0; i<n.length; i++){
            for(int j=0; j<=i; j++){
                sum += n[i][j];
            }
        }
        System.out.print(sum);
    }
}