import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<n; i++){
            String op = sc.next();
            if(op.equals("push")){
                int a = sc.nextInt();
                st.push(a);
            }else if(op.equals("pop")){
                System.out.println(st.pop());
            }else if(op.equals("size")){
                System.out.println(st.size());
            }else if(op.equals("empty")){
                int flag = st.isEmpty()?1:0;
                System.out.println(flag);
            }else if(op.equals("top")){
                System.out.println(st.peek());
            }
        }
    }
}