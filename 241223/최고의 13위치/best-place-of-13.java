import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<n; i++){
            int cnt = 0;
            for(int j=0; j<n-2; j++){
                int sub = arr[i][j]+arr[i][j+1]+arr[i][j+2];
                cnt = sub;
            }
            if(max<cnt){
                max = cnt;
            }
        }
        System.out.print(max);

    }
}