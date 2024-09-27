import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if(a%13==0||a%19==0){
            System.out.print("True");
        }else{
            System.out.print("False");
        }

    }
}