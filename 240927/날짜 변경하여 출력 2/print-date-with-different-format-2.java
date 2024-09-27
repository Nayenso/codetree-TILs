import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useDelimiter("-");
        int month = input.nextInt();
        int day = input.nextInt();
        int year = input.nextInt();

        System.out.print(year+"."+month+"."+day);
    }
}