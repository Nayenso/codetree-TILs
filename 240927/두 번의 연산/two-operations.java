import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if(a%2!=0){
            a+=3;
        }
        if(a%3 == 0){
            a/=3;
        }
        System.out.print(a);
    }
}