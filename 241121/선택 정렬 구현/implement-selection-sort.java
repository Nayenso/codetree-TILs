import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        selectSrot(arr);

        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void selectSrot(int[] A){
        int len = A.length;

        for(int i=0; i<len-1; i++){
            int min = i;
            for(int j=i+1; j<len; j++){
                if(A[min]>A[j]){
                    min = j;
                }
            }
            int temp = A[i];
            A[i] = A[min];
            A[min] = temp;
        }
    }
}