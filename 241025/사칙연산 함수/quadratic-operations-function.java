import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();

        switch(o){
            case '+':
                System.out.printf("%d %c %d = %d",a,o,c,(plus(a,c)));
                break;
            case '-':
                System.out.printf("%d %c %d = %d",a,o,c,minus(a,c));
                break;
            case '*':
                System.out.printf("%d %c %d = %d",a,o,c,multi(a,c));
                break;
            case '/':
                System.out.printf("%d %c %d = %d",a,o,c,minus(a,c));
                break;
            default:
                System.out.print("False");
        }
    }
    
    public static int plus(int a, int c){
        return a+c;
    }

    public static int minus(int a, int c){
        return a-c;
    }

    public static int multi(int a, int c){
        return a*c;
    }

    public static int divide(int a, int c){
        return a/c;
    }
}