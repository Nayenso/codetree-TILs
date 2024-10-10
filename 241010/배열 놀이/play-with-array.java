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
                System.out.println(arr[index]);
            }else if(flag == 2){
                int num = sc.nextInt();
                for(int i=0; i<n; i++){
                    if(arr[i]==num){
                        System.out.println(i);
                        break;
                    }
                }
                System.out.println(0);
            }else if(flag == 3){
                int s = sc.nextInt();
                int e = sc.nextInt();
                for(int i=s; i<=e; i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
    }
}