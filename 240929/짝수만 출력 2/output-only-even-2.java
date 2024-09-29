import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int b = input.nextInt();
        int a = input.nextInt();

        while(b>=a){
            if(b%2==0){
                System.out.print(b +" ");
            }
            b--;
        }
    }
}