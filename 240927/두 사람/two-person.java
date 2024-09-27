import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();

        if(A >= 19 || B >= 19){
            System.out.print(1);
        }else{
            System.out.print(0);
        }
    }
}