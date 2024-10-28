import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        printUp(arr);
        printLower(arr);
    }

    public static void printUp(int[] arr){
        Arrays.sort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void printLower(int[] arr){
        Integer[] arr1 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        
        Arrays.sort(arr1, Collections.reverseOrder());
        for(int i=0; i<arr.length; i++){
            System.out.print(arr1[i]+" ");
        }
    }
}