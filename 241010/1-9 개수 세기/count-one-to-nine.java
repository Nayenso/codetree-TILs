import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[9];
        int[] index = new int[10];

        for(int i=0; i<n; i++){
            num[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            index[num[i]]++;
        }
        for(int i=1; i<10; i++){
            System.out.println(index[i]);
        }
    }
}