import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<n; i++){
            String op = sc.next();
            if(op.equals("push")){
                int a = sc.nextInt();
                q.add(a);
            }else if(op.equals("pop")){
                System.out.println(q.poll());
            }else if(op.equals("size")){
                System.out.println(q.size());
            }else if(op.equals("empty")){
                System.out.println(q.isEmpty()?1:0);
            }else if(op.equals("front")){
                System.out.println(q.peek());
            }
        }
    }
}