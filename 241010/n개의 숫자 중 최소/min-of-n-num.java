import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int INT_MIN = Integer.MAX_VALUE;
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            if(arr[i]<INT_MIN){
                INT_MIN=arr[i];
            }
        }

        System.out.print(INT_MIN);
    }
}