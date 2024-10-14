import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();
        
        while (true) {
            int index = A.indexOf(B);
            if (index == -1) {
                break;
            }
            A = A.substring(0, index) + A.substring(index + B.length());
        }

        System.out.print(A);
    }
}