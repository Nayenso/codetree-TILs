import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            arr[i] = a;
        }

        int Min = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            int sub = 0;
            for(int j=0; j<n; j++){
                int size = i-j;
                if(size<0){
                    size*=-1;
                }
                sub += size*arr[j];
            }
            if(sub<Min){
                Min = sub;
            }
        }
        System.out.print(Min);
    }
}