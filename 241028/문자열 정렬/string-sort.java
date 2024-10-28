import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        char[] c = str.toCharArray();
        Arrays.sort(c);
        String temp = new String(c);
        System.out.print(temp);
    }
}