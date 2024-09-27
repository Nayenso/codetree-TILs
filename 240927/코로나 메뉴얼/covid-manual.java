import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cnt = 0;
        char A = input.next().charAt(0);
        int a = input.nextInt();
        char B = input.next().charAt(0);
        int b = input.nextInt();
        char C = input.next().charAt(0);
        int c = input.nextInt();

        if(A == 'Y' && a >= 37){
            cnt++;
        }
        
        if(B == 'Y' && b >= 37){
            cnt++;
        }
        
        if(C == 'Y' && c >= 37){
            cnt++;
        }
        
        if(cnt >= 2){
            System.out.print("E");
        }else{
            System.out.print("N");
        }
    }
}