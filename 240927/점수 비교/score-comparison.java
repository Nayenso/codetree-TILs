import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int aMath = input.nextInt();
        int aEng = input.nextInt();
        int bMath = input.nextInt();
        int bEng = input.nextInt();

        if(aMath > bMath && aEng > bEng){
            System.out.print(1);
        }else{
            System.out.print(0);
        }
    }
}