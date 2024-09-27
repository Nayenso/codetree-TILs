import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        if(3<= month && month <= 5){
            System.out.print("Spring");
        }else if(6<= month && month <= 8){
            System.out.print("Summer");
        }else if(9<= month && month <= 11){
            System.out.print("Fall");
        }else{
            System.out.print("Winter");
        }
    }
}