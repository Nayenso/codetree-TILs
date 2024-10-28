import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printHead(n);
        System.out.println();
        printRear(n);
    }

    public static void printHead(int n){
        if(n==0){
            return;
        }
        printHead(n-1);
        System.out.print(n+" ");
    }
    public static void printRear(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        printRear(n-1);
    }
    
}