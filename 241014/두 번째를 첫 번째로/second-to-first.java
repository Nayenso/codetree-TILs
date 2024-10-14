import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] s = str.toCharArray();
        char c = s[1], t = s[0];

        for(int i=0; i<s.length; i++){
            if(s[i]==c){
                s[i] = t;
            }
        }
        System.out.print(String.valueOf(s));
    }
}