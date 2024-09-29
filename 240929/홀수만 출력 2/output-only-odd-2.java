import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int b = input.nextInt();
        int a = input.nextInt();
        for(int i = b; i >= a; i--){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
}