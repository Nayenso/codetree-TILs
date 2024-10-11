import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] tri = new int[n][n];

        for(int i=0; i<n; i++){
            tri[i][0] = 1;
        }
        for(int i=1; i<n; i++){
            for(int j=1; j<=i; j++){
                tri[i][j] = tri[i-1][j-1]+tri[i-1][j];
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(tri[i][j] != 0){
                    System.out.print(tri[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}