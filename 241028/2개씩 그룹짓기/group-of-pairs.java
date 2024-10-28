import java.util.*;

public class Main {
    public static int size;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        size = n*2;
        int[] arr = new int[size];
        int m1 = size/2-1, m2 = m1+1;

        inNum(arr);
        
        Arrays.sort(arr);
        System.out.print(arr[m1]+arr[m2]);
    }

    public static void inNum(int[] a){
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
    }
}