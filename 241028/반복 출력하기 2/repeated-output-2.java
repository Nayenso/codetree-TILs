import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printWord(n);
    }

    public static void printWord(int n){
        if(n==0){
            return;
        }
        printWord(n-1);
        System.out.println("HelloWorld");
    }
}