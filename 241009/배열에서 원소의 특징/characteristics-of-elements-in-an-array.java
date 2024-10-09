import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[10];
        for(int i=0; i<10; i++){
            n[i] = sc.nextInt();
            if(n[i]%3==0){
                System.out.print(n[i-1]);
                break;
            }
        }
    }
}