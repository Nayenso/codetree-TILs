import java.util.*;

public class Main {
    public static int size;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        size = n*2;
        int[] arr = new int[size];

        inNum(arr);
        System.out.print(checkMax(arr));
    }

    public static void inNum(int[] a){
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
    }

    public static int checkMax(int[] a){
        Arrays.sort(a);
        int max = Integer.MIN_VALUE, index = 0;
        int s = 0, e = a.length-1;
        int[] aMax = new int[a.length/2];

        while(s<e){
            int n = a[s]+a[e];
            aMax[index++] = n;
            s++;
            e--;
        }
        return findMax(aMax);
    }

    public static int findMax(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}