import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if(a>b){
            System.out.print(a*b);
        }else{
            System.out.print(b/a);
        }
    }
}