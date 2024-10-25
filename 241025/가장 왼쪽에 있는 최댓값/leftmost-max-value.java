import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int index = n;

        while(index>0){
            int max = Integer.MIN_VALUE;
            int maxIndex = -1;

            for(int i=0; i<index; i++){
                if(max < arr[i]){
                    max = arr[i];
                    maxIndex = i;
                }
            }
            System.out.print((maxIndex+1)+" ");
            index = maxIndex;
        }
    }
}