import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a1 = new int[3][3];
        int[][] a2 = new int[3][3];

        for(int i=0; i<a1.length; i++){
            for(int j=0; j<a1[i].length; j++){
                a1[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<a2.length; i++){
            for(int j=0; j<a2[i].length; j++){
                a2[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<a1.length; i++){
            for(int j=0; j<a1[i].length; j++){
                System.out.print(a1[i][j]*a2[i][j]+" ");
            }
            System.out.println();
        }
    }
}