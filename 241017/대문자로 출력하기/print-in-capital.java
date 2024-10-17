import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String re = "";

        for(int i=0; i<str.length(); i++){
            if('A' <= str.charAt(i) && str.charAt(i) <= 'Z'){
                re += str.charAt(i);
            }else if('a' <= str.charAt(i) && str.charAt(i) <= 'z'){
                re += (char)(str.charAt(i)-('a'-'A'));
            }
        }
        System.out.print(re);
    }
}