import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();
        int grade = (score == 100)?0:-1;
        if(grade == 0){
            System.out.print("pass");
        }eles{
            System.out.print("failure");
        }
    }
}