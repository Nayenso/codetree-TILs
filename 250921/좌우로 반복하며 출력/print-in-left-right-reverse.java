import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] num = new int[N];
        
        int cnt = 1;
        for(int i=0; i<N; i++){
            num[i] = cnt++;
        }

        for(int i=1; i<=N; i++){
            if(i%2!=0){
                for(int j=0; j<N; j++){
                    System.out.print(num[j]);
                }
                System.out.println();
            }else{
                for(int j=N-1; j>=0; j--){
                    System.out.print(num[j]);
                }
                System.out.println();
            }
        }
    }
}