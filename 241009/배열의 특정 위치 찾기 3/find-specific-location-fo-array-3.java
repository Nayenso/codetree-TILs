import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[100];
        int index = 0;

        for(int i=0; i<100; i++){
            n[i] = sc.nextInt();
            if(n[i]==0){
                index=i-1;
                break;
            }
        }
        int sum = n[index]+n[index-1]+n[index-2];
        System.out.print(sum);
    }
}