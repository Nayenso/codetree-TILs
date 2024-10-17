import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for(int i=0; i<str.length(); i++){
            if('0' <= str.charAt(i) && str.charAt(i) <= '9'){
                System.out.print(str.charAt(i));
            }else if('a' <= str.charAt(i) && str.charAt(i) <= 'z'){
                System.out.print(str.charAt(i));
            }else if('A' <= str.charAt(i) && str.charAt(i) <= 'Z'){
                System.out.print((char)(str.charAt(i)-'A'+'a'));
            }
        }
    }
}