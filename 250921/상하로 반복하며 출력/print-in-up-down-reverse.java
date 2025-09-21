import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] arr = new int[N][N];

        for(int i=1; i<=N; i++){
            int cnt = 1;
            if(i%2!=0){
                for(int j=0; j<N; j++){
                    arr[j][i-1] = cnt++;
                }
            }else{
                for(int j=N-1; j>=0; j--){
                    arr[j][i-1] = cnt++;
                }
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}