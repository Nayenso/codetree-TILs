import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useDelimiter(".");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        System.out.print(month+"-"+day+"-"+year);
    }
}