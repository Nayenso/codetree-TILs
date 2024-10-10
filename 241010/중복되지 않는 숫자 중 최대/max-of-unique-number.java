import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        boolean flag = false;

        int[] arr = new int[n];
        int[] index = new int[1001];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            index[arr[i]]++;
        }

        for(int i=0; i<n; i++){
            if(max < arr[i] && index[arr[i]]==1){
                flag = true;
                max = arr[i];
            }
        }
        if(flag){
            System.out.print(max);
        }else{
            System.out.print(-1);
        }
    }
}