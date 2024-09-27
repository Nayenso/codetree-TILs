import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(n*n);
        if(n<5){
            System.out.print("tiny");
        }
    }
}