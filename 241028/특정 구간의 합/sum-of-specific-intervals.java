import java.util.*;

public class Main {
    public static int sum = 0;
    public static int[] arr;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt();
        arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        print(arr, m);
    }

    public static void print(int[] arr, int m){
        for(int i=0; i<m; i++){
            int id1 = sc.nextInt(), id2 = sc.nextInt();
            makeSum(id1, id2);
            System.out.println(sum);
            sum = 0;
        }
    }

    public static void makeSum(int a, int b){
        for(int i=a-1; i<b; i++){
            sum+=arr[i];
        }
    }
}