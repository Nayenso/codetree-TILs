import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] ar1 = new int[3][3];
        int[][] ar2 = new int[3][3];
        
        for(int i=0; i<ar1.length; i++){
            for(int j=0; j<ar1[i].length; j++){
                ar1[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<ar1.length; i++){
            for(int j=0; j<ar1[i].length; j++){
                ar2[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<ar1.length; i++){
            for(int j=0; j<ar1[i].length; j++){
                System.out.print(ar1[i][j]*ar2[i][j]+" ");
            }
            System.out.println();
        }
    }
}