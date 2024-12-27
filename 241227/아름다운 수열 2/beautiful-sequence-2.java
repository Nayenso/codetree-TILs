import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        int cnt = 0;
        int[] A = new int[N];
        int[] B = new int[M];

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }

        for(int i=0; i<M; i++){
            B[i] = sc.nextInt();
        }

        for(int i=0; i<=N-M; i++){
            boolean[] flag = new boolean[M];
            int t = 0;
            for(int j=i; j<i+M; j++){
                for(int k=0; k<M; k++){
                    if(flag[k]==true){
                        continue;
                    }
                    if(A[j]==B[k]){
                        flag[k]=true;
                        t++;
                        break;
                    }
                }
                if(t==M){
                    cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}