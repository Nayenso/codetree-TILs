import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int index = -1;

        for(int i=0; i<n; i++){
            if(max < arr[i]){
                max = arr[i];
                index = i;
            }
        }
        System.out.print((index+1)+" ");

        while(true){
            max = Integer.MIN_VALUE;
            for(int i=0; i<index; i++){
                if(max < arr[i]){
            \}
            System.out.print((index+1)+" ");
            if(index==0){
                break;
            \}
        \}
    \}
\}
349public class Main {    public static void main(String[] args) {        for(int i=0; i<n; i++){
$0
                    max = arr[i];
                    index = i;
                }
            }
            System.out.print((index+1)+" ");
            if(index==0){
                break;
            }
        }
    }
}