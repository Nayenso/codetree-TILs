import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String wd = sc.next();

        if(flag(wd)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }

    public static boolean flag(String w){
        Stack<Character> st = new Stack<>();
        int len = w.length();

        for(int i=0; i<len; i++){
            char c = w.charAt(i);
            if(c=='('){
                st.push(c);
            }else{
                if(st.isEmpty()){
                    return false;
                }
                st.pop();
            }
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}