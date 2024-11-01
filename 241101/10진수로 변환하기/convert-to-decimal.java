import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] temp = str.split("");
        int num = 0;

        for(int i=0; i<temp.length; i++){
            num = num*2 + Integer.valueOf(temp[i]);
        }
        System.out.print(num);
    }
}