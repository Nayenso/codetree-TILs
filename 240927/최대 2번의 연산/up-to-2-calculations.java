import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        if(a%2==0){
            a/=2;
        }
        if(a%2 != 0){
            a = (a+1)/2;
        }
        System.out.print(a);
    }
}