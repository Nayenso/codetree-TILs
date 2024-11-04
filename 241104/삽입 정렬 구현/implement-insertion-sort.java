import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        insertSort(arr);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void insertSort(int[] ar){
        int len = ar.length;
        
        for(int i=1; i<len; i++){
            int j = i-1;
            int key = ar[i];
            while(j>=0 && ar[j]>key){
                ar[j+1] = ar[j];
                j--;
            }
            ar[j+1] = key;
        }
    }
}