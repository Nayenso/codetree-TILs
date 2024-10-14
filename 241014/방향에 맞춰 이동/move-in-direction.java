import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = 0, y = 0;

        int[] dx = {1,0,-1,0};
        int[] dy = {0,-1,0,1};

        for(int i=0; i<N; i++){
            char op = sc.next().charAt(0);
            int n = sc.nextInt();
            switch(op){
                case 'N':
                    x+=dx[3];
                    y+=dy[3]*n;
                    break;
                case 'S':
                    x+=dx[1];
                    y+=dy[1]*n;
                    break;
                case 'E':
                    x+=dx[0]*n;
                    y+=dy[0];
                    break;
                case 'W':
                    x+=dx[2]*n;
                    y+=dy[2];
                    break;
            }
        }
        System.out.printf("%d %d",x,y);
    }
}