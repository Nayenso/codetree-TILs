import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if(a<b&&b<c){
            System.out.print(1);
        }else{
            System.out.print(0);
        }
    }
}