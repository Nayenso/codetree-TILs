import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n>=80){
            System.out.print("pass");
        }else{
            System.out.printf("%d more score",80-n);
        }
    }
}