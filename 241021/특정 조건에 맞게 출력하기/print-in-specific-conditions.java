import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int index = 0;

        while(true){
            int n = sc.nextInt();
            if(n==0){
                break;
            }
            arr[index++] = n;
        }

        for(int i=0; i<index; i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]/2+" ");
            }else{
                System.out.print((arr[i]+3)+" ");
            }
        }
    }
}