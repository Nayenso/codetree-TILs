import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;

        for(int i=0; i<n-2; i++){
            int sub = 0;
            for(int j=i+2; j<n; j++){
                sub = arr[i]+arr[j];
                if(max<sub){
                    max = sub;
                }
            }
        }
        System.out.print(max);
    }
}