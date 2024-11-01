import java.util.*;

public class Main {
    public static int[] check;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        check = new int[101];

        for(int i=0; i<n; i++){
            int s = sc.nextInt();
            int e = sc.nextInt();

            check(s,e);
        }

        int max = Integer.MIN_VALUE;
        for(int i=1; i<=100; i++){
            if(max < check[i]){
                max = check[i];
            }
        }

        System.out.print(max);
    }

    public static void check(int s, int e){
        for(int i=s; i<=e; i++){
            check[i]++;
        }
    }
}