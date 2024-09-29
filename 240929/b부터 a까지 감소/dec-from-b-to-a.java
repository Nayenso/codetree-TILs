import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        for(int i = b; i >= a; i--){
            System.out.print(i+" ");
        }
    }
}