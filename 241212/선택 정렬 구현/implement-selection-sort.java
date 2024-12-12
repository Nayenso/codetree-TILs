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
        int len = A.length;

        for(int i=0; i<len-1; i++){
            int min = i;
            for(int j=i+1; j<len; j++){
                if(A[j] < A[min]){
                    min = j;
                }
            }
            int temp = A[min];
            A[min] = A[i];
            A[i] = temp;
        }
    }
}