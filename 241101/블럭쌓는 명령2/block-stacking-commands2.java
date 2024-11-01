import java.util.*;

public class Main {
    public static int[] arr = new int[100];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int max = Integer.MIN_VALUE;

        for(int i=0; i<k; i++){
            int s = sc.nextInt();
            int e = sc.nextInt();
            makeOne(s,e);
        }

        for(int i=0; i<n; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.print(max);
    }

    public static void makeOne(int start, int end){
        for(int i=start-1; i<end; i++){
            arr[i]++;
        }
    }
}