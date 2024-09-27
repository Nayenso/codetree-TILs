import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double left = input.nextDouble();
        double right = input.nextDouble();

        if(left >= 1.0 && rigth >= 1.0){
            System.out.print("High");
        }else if(left >= 0.5 && right >= 0.5){
            System.out.print("Middle");
        }else{
            System.out.print("Low");
        }
    }
}