import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            String op = sc.next();

            if(op.equals("push")){
                int v = sc.nextInt();
                q.add(v);
            }else if(op.equals("pop")){
                System.out.println(q.poll());
            }else if(op.equals("size")){
                System.out.println(q.size());
            }else if(op.equals("empty")){
                int t = (q.isEmpty())?1:0;

                System.out.println(t);
            }else if(op.equals("front")){
                System.out.println(q.peek());
            }
        }
    }
}