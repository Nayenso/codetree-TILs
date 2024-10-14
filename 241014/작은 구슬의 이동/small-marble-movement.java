import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
               //  북 동 서 남
        int[] dx = {-1, 0, 0, 1};
        int[] dy = {0, 1, -1, 0};

        int n = sc.nextInt();
        int t = sc.nextInt();

        int r = sc.nextInt()-1;
        int c = sc.nextInt()-1;
        char op = sc.next().charAt(0);
        int o = changeNum(op);

        for(int i=1; i<t; i++){
            int nx = r+dx[o], ny = c+dy[o];
            if(!range(nx, ny, n)){
                o = 3-o;
            }

            r = r+dx[o];
            c = c+dy[o];
        }

        System.out.print(r+1+" "+(c+1));
    }

    public static int changeNum(char c){
        if(c=='U'){
            return 0;
        }else if(c=='R'){
            return 1;
        }else if(c=='L'){
            return 2;
        }else{
            return 3;
        }
    }

    public static boolean range(int x, int y, int n){
        return (0<=x && x<n && 0<=y && y<n);
    }
}