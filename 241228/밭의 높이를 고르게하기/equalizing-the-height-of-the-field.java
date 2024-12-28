import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int H = sc.nextInt();
        int T = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<=N-T; i++){
            int sub = 0;
            for(int j=i; j<i+T; j++){
                if(arr[j]==H){
                    continue;
                }else{
                    int minus = arr[j]-H;
                    if(minus<0){
                        minus*=-1;
                    }
                    sub+=minus;
                }
            }
            if(min>sub){
                min = sub;
            }
        }
        System.out.print(min);
    }
}