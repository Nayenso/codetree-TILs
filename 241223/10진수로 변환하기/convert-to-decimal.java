import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        int num = 0;

        for(int i=0; i<n.length(); i++){
            num = num*2+(n.charAt(i)-'0');
        }
        System.out.print(num);
    }
}