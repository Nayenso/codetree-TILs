import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(;;){
            int a = input.nextInt();
            int b = input.nextInt();
            char c = input.next().charAt(0);
            System.out.println(a*b);
            if(c=='C'){
                break;
            }
        }
    }
}