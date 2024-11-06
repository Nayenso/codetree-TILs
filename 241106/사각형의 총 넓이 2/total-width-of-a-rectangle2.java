import java.util.*;

public class Main {
    public static final int OFF_SET = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] space = new int[200][200];
        int cnt = 0;

        for(int i=0; i<n; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            x1+=OFF_SET;
            y1+=OFF_SET;
            x2+=OFF_SET;
            y2+=OFF_SET;
            for(int s=x1; s<x2; s++){
                for(int e=y1; e<y2; e++){
                    if(space[s][e]!=1){
                        space[s][e]++;
                    }
                }
            }
        }

        for(int i=0; i<200; i++){
            for(int j=0; j<200; j++){
                if(space[i][j]==1){
                    cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}