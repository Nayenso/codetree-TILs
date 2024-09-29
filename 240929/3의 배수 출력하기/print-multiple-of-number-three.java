import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 1;
        while(i<=n){
            if(i%3==0){
                System.out.print(i+" ");
            }
            i++;
        }
    }
}