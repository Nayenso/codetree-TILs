import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        if(flag(word)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }

    public static boolean flag(String wd){
        Stack<Character> s = new Stack<>();
        int len = wd.length();

        for(int i=0; i<len; i++){
            char tm = wd.charAt(i);

            if(tm=='('){
                if(s.size()==len){
                    System.out.print("error");
                    return false;
                }
                s.push(tm);
            }else{
                if(s.size()==0){
                    System.out.print("error");
                    return false;
                }
                s.pop();
            }
        }
        if(!s.isEmpty()){
            return false;
        }
        return true;
    }
}