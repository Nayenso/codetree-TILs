import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        char aS = input.next().charAt(0);
        int B = input.nextInt();
        char bS = input.next().charAt(0);

        if((A >= 19 && aS == 'M')|| (B >= 19 && bS == 'M')){
            System.out.print(1);
        }else{
            System.out.print(0);
        }
    }
}