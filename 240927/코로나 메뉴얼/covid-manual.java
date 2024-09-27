import java.util.*;

public class Main {
    public static void main(String[] args) {
        int cnt = 0;
        char A = next().charAt(0);
        int a = nextInt();
        char B = next().charAt(0);
        int b = nextInt();
        char C = next().charAt(0);
        int c = nextInt();

        if(A == 'Y' && a >= 37){
            cnt++;
        }
        
        if(B == 'Y' && b >= 37){
            cnt++;
        }
        
        if(C == 'Y' && c >= 37){
            cnt++;
        }
        
        if(D == 'Y' && d >= 37){
            cnt++;
        }
        if(cnt >= 2){
            System.out.print("E");
        }else{
            System.out.print("N");
        }
    }
}