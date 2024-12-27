import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), cnt = 0;
        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<N; i++){
            for(int j=i; j<N; j++){
                int sub = 0;
                int div = 0;
                for(int k=i; k<=j; k++){
                    sub+=arr[k];
                    div++;
                }
                double avg = (double)sub/div;
                for(int t=i; t<=j; t++){
                    if(arr[t]==avg){
                        cnt++;
                        break;
                    }
                }
            }
        }
        System.out.print(cnt);
    }
}