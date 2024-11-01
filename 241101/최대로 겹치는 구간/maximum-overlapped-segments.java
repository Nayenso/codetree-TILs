import java.util.*;

public class Main {
    public static final int OFF_SET = 100;
    public static int[] flag;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        flag = new int[201];

        for(int i=0; i<n; i++){
            int s = sc.nextInt();
            int e = sc.nextInt();
            
            s+=OFF_SET;
            e+=OFF_SET;
            check(s,e);
        }

        int max = Integer.MIN_VALUE;

        for(int i=0; i<=200; i++){
            if(max < flag[i]){
                max = flag[i];
            }
        }
        System.out.print(max);
    }

    public static void check(int s, int e){
        for(int i=s; i<e; i++){
            flag[i]++;
        }
    }
}