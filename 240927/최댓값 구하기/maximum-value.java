import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = a;
        if(max < b){
            max = b;
        }
        if(max < c){
            max = c;
        }
        System.out.print(max);
    }
}