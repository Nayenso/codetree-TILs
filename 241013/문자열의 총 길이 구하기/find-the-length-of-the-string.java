import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = 0;
        String[] str = new String[10];

        for(int i=0; i<10; i++){
            str[i] = sc.next();
            len+=str[i].length();
        }
        System.out.print(len);
    }
}