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

    public static void selectSort(int[] arr){
        int len = arr.length;

        for(int i=0; i<len-1; i++){
            int min = i;
            for(int j=i+1; j<len; j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}