import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useDelimiter("-");

        int front = input.nextInt();
        int mid = input.nextInt();
        int rear = input.nextInt();

        System.out.print(0+""+front+"-"+rear+"-"+mid);
    }
}