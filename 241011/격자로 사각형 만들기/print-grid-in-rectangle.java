import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] num = new int[n][n];

        for(int i=0; i<n; i++){
            num[0][i] = 1;
            num[i][0] = 1;
        }

        for(int i=1; i<n; i++){
            for(int j=1; j<n; j++){
                num[i][j] = num[i-1][j]+num[i][j-1]+num[i-1][j-1];
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
    }
}