import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int num = 0;

        for(int i=0; i<m; i++){
            if(i%2==0){
                for(int j=0; j<n; j++){
                    arr[j][i] = num++;
                }
            }else{
                for(int j=0; j<n; j++){
                    arr[n-j-1][i] = num++;
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}