import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int h = input.nextInt();
        int w = input.nextInt();
        double b = (10000*w) / (h*h);
        System.out.printf("%.0f\n",b);
        if(b >= 25){
            System.out.print("Obesity");
        }
    }
}