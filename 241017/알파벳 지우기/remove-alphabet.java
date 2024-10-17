import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        String temp1 = "", temp2 = "";

        for(int i=0; i<str1.length(); i++){
            if('0' <= str1.charAt(i) && str1.charAt(i) <= '9'){
                temp1 += str1.charAt(i);
            }
        }

        for(int i=0; i<str2.length(); i++){
            if('0' <= str2.charAt(i) && str2.charAt(i) <= '9'){
                temp2 += str2.charAt(i);
            }
        }
        System.out.print(Integer.parseInt(temp1) + Integer.parseInt(temp2));
    }
}