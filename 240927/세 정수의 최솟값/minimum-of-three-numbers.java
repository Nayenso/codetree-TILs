import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int min = a;
        if(min > b){
            min = b;
        }else if(min > c){
            min = c;
        }
        System.out.print(min);
    }
}