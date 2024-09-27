import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temp = input.nextInt();

        if(temp >= 100){
            System.out.print("vapor");
        }else if(temp >= 0){
            System.out.print("water");
        }else{
            System.out.print("ice");
        }
    }
}