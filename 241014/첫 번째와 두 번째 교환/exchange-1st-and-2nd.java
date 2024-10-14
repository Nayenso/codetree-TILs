import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char c1 = str.charAt(0);
        char c2 = str.charAt(1);
        char[] s = str.toCharArray();

        for(int i=0; i<s.length; i++){
            if(s[i]==c1){
                s[i] = c2;
            }else if(s[i]==c2){
                s[i] = c1;
            }
        }
        System.out.print(String.valueOf(s));
    }
}