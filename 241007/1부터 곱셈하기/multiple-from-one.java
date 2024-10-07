import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int s = 1;
        for(int i=1; i<=10; i++){
            s*=i;
            if(i>=n){
                System.out.print(i);
                break;
            }
        }
    }
}