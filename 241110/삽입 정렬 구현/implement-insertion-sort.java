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

    public static void insertSort(int[] A){
        int size = A.length;

        for(int i=1; i<size-1; i++){
            int j = i-1;
            int key = A[i];

            while(j>=0 && A[j] > key){
                A[j+1] = A[j];
                j--;
            } 
            A[j+1] = key;
        }
    }
}