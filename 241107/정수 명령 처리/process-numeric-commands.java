import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<n; i++){
            String op = sc.next();

            if(op.equals("push")){
                int n1 = sc.nextInt();
                s.push(n1);
            }else if(op.equals("pop")){
                System.out.println(s.pop());
            }else if(op.equals("size")){
                System.out.println(s.size());
            }else if(op.equals("empty")){
                System.out.println((s.isEmpty())?1:0);
            }else if(op.equals("top")){
                System.out.println(s.peek());
            }
        }
    }
}