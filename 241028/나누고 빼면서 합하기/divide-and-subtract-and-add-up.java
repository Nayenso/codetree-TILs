import java.util.*;

class temp{
    int num;
    public temp(int n){
        num = n;
    }
}

public class Main {
    public static int sum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        change(arr, m);
        System.out.print(sum);
    }

    public static void change(int[] a, int m){
        while(m>=1){
            if(m%2==0){
                sum+=a[m-1];
                m/=2;
            }else{
                sum+=a[m-1];
                m-=1;
            }
        }
    }
}