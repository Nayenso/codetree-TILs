import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char c = input.next().charAt(0);
        int n = input.nextInt();

        if(c == 'A'){
            for(int i = 1; i <= n; i++){
                System.out.print(i+" ");
            }
        }else if(c == 'D'){
            for(int i = n; i >= 1; i--){
                System.out.print(i+" ");
            }
        }
    }
}