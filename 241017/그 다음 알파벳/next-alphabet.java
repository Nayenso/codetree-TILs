import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if(c=='z'){
            System.out.print('a');
            return;
        }
        char nextC = (char)((int)c+1);

        System.out.print(nextC);
    }
}