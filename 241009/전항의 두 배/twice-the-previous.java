import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[10];
        n[0] = sc.nextInt();
        n[1] = sc.nextInt();

        for(int i=2; i<10; i++){
            n[i] = n[i-1]+2*n[i-2];
        }
        for(int i:n){
            System.out.print(i+" ");
        }
    }
}