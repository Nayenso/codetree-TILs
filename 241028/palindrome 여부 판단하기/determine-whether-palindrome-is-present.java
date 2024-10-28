import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean flag = isPalindrome(str);
        if(flag){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }

    public static boolean isPalindrome(String str){
        int start = 0, end = str.length()-1;

        while(start<end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}