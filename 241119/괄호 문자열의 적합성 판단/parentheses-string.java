import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String w = sc.next();
        int len = w.length();
        Stack<Character> st = new Stack<>();

        for(int i=0; i<len; i++){
            char c = w.charAt(i);
            if(c=='('){
                st.push(c);
            }else{
                if(st.isEmpty()){
                    System.out.print("No");
                    return;
                }
                st.pop();
            }
        }
        if(st.isEmpty()){
            System.out.print("Yes");
            return;
        }
        System.out.print("No");
    }
}