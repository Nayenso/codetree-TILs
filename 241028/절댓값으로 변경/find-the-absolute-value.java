import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        change(arr);
        for(int i: arr){
            System.out.print(i+" ");
        }
    }

    public static void change(int[] arr){
        for(int i=0; i<n; i++){
            if(arr[i]<0){
                arr[i] *= (-1);
            }
        }
    }
}