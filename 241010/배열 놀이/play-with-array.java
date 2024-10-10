import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<q; i++){
            int flag = sc.nextInt();
            if(flag == 1){
                int index = sc.nextInt();
                System.out.println(arr[index-1]);
            }else if(flag == 2){
                int num = sc.nextInt();
                int Q = -1;
                for(int j=0; j<n; j++){
                    if(arr[j]==num){
                        System.out.println(j+1);
                        Q = 0;
                        break;
                    }
                }
                if(Q == -1){
                    System.out.println(0);
                }
            }else if(flag == 3){
                int s = sc.nextInt();
                int e = sc.nextInt();
                for(int t=s-1; t<=e-1; t++){
                    System.out.print(arr[t]+" ");
                }
                System.out.println();
            }
        }
    }
}