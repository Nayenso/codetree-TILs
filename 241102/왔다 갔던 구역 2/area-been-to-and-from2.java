import java.util.*;

public class Main {
    public static int[] arr;
    public static int start;
    public static int cnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[4001];
        start = 2000;
        cnt = 0;

        for(int i=0; i<n; i++){
            int index = sc.nextInt();
            char op = sc.next().charAt(0);

            start = check(index, op, start);
        }

        System.out.print(cnt);
    }

    public static int check(int index, char op, int start){
        int temp = start;

        if(op == 'R'){
            for(int i=start; i<start+index; i++){
                arr[i]++;
                if(arr[i] == 2){
                    cnt++;
                }
            }
            temp = start+index;
        }
        if(op == 'L'){
            for(int i=start; i>start-index; i--){
                arr[i]++;
                if(arr[i] == 2){
                    cnt++;
                }
            }
            temp = start-index;
        }
        return temp;
    }
}