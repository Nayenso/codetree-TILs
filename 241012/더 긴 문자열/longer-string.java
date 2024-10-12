import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int len1 = s1.length();
        int len2 = s2.length();
        if(len1>len2){
            System.out.print(s1+" "+len1);
        }else if(len1<len2){
            System.out.print(s2+" "+len2);
        }else{
            System.out.print("same");
        }
    }
}