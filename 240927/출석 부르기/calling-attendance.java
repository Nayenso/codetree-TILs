import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if(num == 1){
            System.out.print("John");
        }else if(num == 2){
            System.out.print("Tom");
        }else if(num == 3){
            System.out.print("Paul");
        }else{
            System.out.print("Vacancy");
        }
    }
}