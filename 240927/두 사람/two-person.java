import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        char aS = input.next().charAt(0);
        int B = input.nextInt();
        char BS = input.next().charAt(0);

        if(A >= 19 || B >= 19){
            System.out.print(1);
        }else{
            System.out.print(0);
        }
    }
}