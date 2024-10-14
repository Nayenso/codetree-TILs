import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                // 북 서 남 동
        int[] dx = {0, -1, 0, 1};
        int[] dy = {1, 0, -1, 0};
        int cnt = 0, reCnt = 0;
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                cnt=0;
                for(int index=0; index<4; index++){
                    int x = i+dx[index], y = j+dy[index];
                    if(range(x,y,n) && arr[x][y]==1){
                        cnt++;
                    }
                }
                if(cnt>=3){
                    reCnt++;
                }
            }
        }


        System.out.print(reCnt);
    }

    public static boolean range(int x, int y, int n){
        if((0<=x && x<n) && (0<=y && y<n)){
            return true;
        }else{
            return false;
        }
    }
}