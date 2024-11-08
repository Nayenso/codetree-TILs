import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();

        if(o=='+'){
            plus(a,c);
        }else if(o=='-'){
            minus(a,c);
        }else if(o=='*'){
            multi(a,c);
        }else if(o=='/'){
            divide(a,c);
        }else{
            System.out.print("False");
        }

    }

    public static void plus(int a, int b){
        System.out.printf("%d + %d = %d",a,b,a+b);
    }
    public static void minus(int a, int b){
        System.out.printf("%d - %d = %d",a,b,a-b);
    }
    public static void multi(int a, int b){
        System.out.printf("%d * %d = %d",a,b,a*b);
    }
    public static void divide(int a, int b){
        System.out.printf("%d / %d = %d",a,b,a/b);
    }
}