import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        final int INT_MAX = Integer.MIN_VALUE;
        for(int i=0; i<10; i++){
            arr[i] = sc.nextInt();
        }
        for(int i:arr){
            if(i>INT_MAX){
                INT_MAX = i;
            }
        }

        System.out.print(INT_MAX);
    }
}