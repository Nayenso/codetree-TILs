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

        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void insertSort(int[] arr){
        int len = arr.length;

        for(int i=1; i<len; i++){
            int j=i-1;
            int key = arr[i];
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}