import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(;;){
            int n = input.nextInt();
            if(n<25){
                System.out.println("Higher");
            }else if(n>25){
                System.out.println("Lower");
            }else{
                System.out.print("Good");
            }
        }
    }
}