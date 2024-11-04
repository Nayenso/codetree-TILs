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
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void selectSort(int[] ar){
        int len = ar.length;

        for(int i=0; i<len-1; i++){
            int min = i;
            for(int j=i+1; j<len; j++){
                if(ar[j]<ar[min]){
                    min = j;
                }
            }
            int temp = ar[i];
            ar[i] = ar[min];
            ar[min] =temp;
        }
    }
}