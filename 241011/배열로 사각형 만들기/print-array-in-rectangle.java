import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[][] n = new int[5][5];

        for(int i=0; i<5; i++){
            n[0][i] = 1;
            n[i][0] = 1;
        }
        for(int i=1; i<5; i++){
            for(int j=1; j<5; j++){
                n[i][j] = n[i-1][j]+ n[i][j-1];
            }
        }
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print(n[i][j]+" ");
            }
            System.out.println();
        }
    }
}