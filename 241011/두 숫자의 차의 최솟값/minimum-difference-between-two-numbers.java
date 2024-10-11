import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];

        for(int i=0; i<n; i++){
            num[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                int a = num[i]-num[j]>0?num[i]-num[j]:(num[i]-num[j])*-1;
                if(min > a){
                    min = a;
                }                
            }
        }
        System.out.print(min);
    }
}