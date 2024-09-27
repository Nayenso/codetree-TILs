import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double eyes = input.nextDouble();
        if(eyes >= 1.0){
            System.out.print("High");
        }else if(eyes >= 0.5){
            System.out.print("Middle");
        }else{
            System.out.print("Low");
        }
    }
}