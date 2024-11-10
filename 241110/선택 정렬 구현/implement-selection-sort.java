import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        selectSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void selectSort(int[] A){
        int size = A.length;

        for(int i=0; i<size-1; i++){
            int min = i;
            for(int j=i+1; j<size; j++){
                if(A[min]>A[j]){
                    min = j;
                }
            }
            int temp = A[min];
            A[min] = A[i];
            A[i] = temp;
        }
    }
}