import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void bubbleSort(int[] A){
        boolean flag = true;
        int len = A.length;

        do{
            flag = true;
            for(int i=0; i<len-1; i++){
                if(A[i]>A[i+1]){
                    int temp = A[i];
                    A[i] = A[i+1];
                    A[i+1] = temp;
                    flag = false;
                }
            }
        }while(!flag);
    }
}