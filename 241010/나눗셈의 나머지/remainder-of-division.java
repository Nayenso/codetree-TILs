import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] index = new int[10];
        int sum = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();

        while(a>1){
            index[a%b]++;
            a = a/b;
        }
        for(int i=0; i<10; i++){
            sum += index[i]*index[i];
        }
        System.out.print(sum);
    }
}