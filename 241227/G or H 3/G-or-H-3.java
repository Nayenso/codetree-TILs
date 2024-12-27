import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), K = sc.nextInt(), cnt=0;
        int max = Integer.MIN_VALUE;
        int[] arr = new int[10001];

        for(int i=0; i<N; i++){
            int index = sc.nextInt();
            char c = sc.next().charAt(0);
            if(c=='G'){
                arr[index]+=1;
            }else{
                arr[index]+=2;
            }
        }

        for(int i=1; i<=10000-K; i++){
            int sub = 0;
            for(int j=i; j<=i+K; j++){
                sub+=arr[j];
            }
            if(max<sub){
                max = sub;
            }
        }
        System.out.print(max);
    }
}