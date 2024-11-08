import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if(flag(str)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }

    public static boolean flag(String s){
        char c = s.charAt(0);

        for(int i=1; i<s.length(); i++){
            if(c!=s.charAt(i)){
                return true;
            }
        }

        return false;
    }
}