import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[10];
        int n = sc.nextInt();
        int cnt = 0;

        for(int i=1; i<=10; i++){
            System.out.print(n*i);
            if(n*i%5==0){
                cnt++;
            }
            if(cnt==2){
                break;
            }
        }
    }
}