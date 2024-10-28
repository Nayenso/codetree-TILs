import java.util.*;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static int n;

    public static void main(String[] args) {
        n = sc.nextInt();
        int[] arr = new int[n];

        printMid(arr);
    }

    public static void printMid(int[] a){
        int cnt = 0;

        for(int i=1; i<=n; i++){
            a[i-1] = sc.nextInt();
            cnt++;
            if(i%2!=0){
                System.out.print(findMid(a,cnt)+" ");
            }
        }
    }

    public static int findMid(int[] a, int cnt){
        int[] temp = new int[cnt];
        
        for(int i=0; i<cnt; i++){
            temp[i] = a[i];
        }
        Arrays.sort(temp);

        return temp[cnt/2];
    }
}