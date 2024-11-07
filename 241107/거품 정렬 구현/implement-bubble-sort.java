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

    public static void bubbleSort(int[] Arr){
        boolean flag = true;
        int len = Arr.length;

        do{
            flag = true;
            for(int i=0; i<len-1; i++){
                if(Arr[i]>Arr[i+1]){
                    int temp = Arr[i];
                    Arr[i] = Arr[i+1];
                    Arr[i+1] = temp;
                    flag = false;
                }
            }
        }while(!flag);

    }
}