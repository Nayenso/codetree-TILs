import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a1 = new int[n][m];
        int[][] a2 = new int[n][m];
        int[][] a3 = new int[n][m];

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
                if(a1[i][j] == a2[i][j]){
                    a3[i][j] = 0;
                }else{
                    a3[i][j] = 1;
                }
            }
        }

        for(int i=0; i<a2.length; i++){
            for(int j=0; j<a2[i].length; j++){
                System.out.print(a3[i][j]+" ");
            }
            System.out.println();
        }
    }
}