import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;
        int[][] num = new int[n][n];
        int k = 1;

        for(int i=n-1; i>=0; i--){
            if(cnt%2 != 0){
                for(int j=n-1; j>=0; j--){
                    num[j][i] = k++;
                }
                cnt++;
            }else{
                for(int j=0; j<n; j++){
                    num[j][i] = k++;
                }
                cnt++;
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