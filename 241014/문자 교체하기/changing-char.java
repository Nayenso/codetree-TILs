import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        char[] t = str2.toCharArray();
        t[0] = str1.charAt(0);
        t[1] = str1.charAt(1);

        System.out.print(String.valueOf(t));
    }
}