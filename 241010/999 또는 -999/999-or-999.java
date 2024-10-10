import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }

    int[] arr = new int[100];
    int cnt = 0;
    int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

    for(int i=0; i<100; i++){
        arr[i] = sc.nextInt();
        cnt++;
        if(arr[i]==999 || arr[i]==-999){
            break;
        }
    }
    for(int i=0 i<cnt; i++){
        if(max < arr[i]){
            max = arr[i];
        }
        if(min > arr[i]){
            min = arr[i];
        }
    }

    System.out.print(max+" "+min);
}