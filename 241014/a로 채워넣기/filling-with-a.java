import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char[] c = str.toCharArray();
        c[1]='a';
        c[c.length-2]='a';
        System.out.print(String.valueOf(c));
    }
}