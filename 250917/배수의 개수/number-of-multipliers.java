import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int cnt_3 = 0, cnt_5 = 0;

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            if(arr[i]%3==0){
                cnt_3++;
            }
            if(arr[i]%5==0){
                cnt_5++;
            }
        }

        System.out.print(cnt_3+" "+cnt_5);

    }
}