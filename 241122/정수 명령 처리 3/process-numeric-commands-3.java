import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Deque<Integer> d = new ArrayDeque<>();

        for(int i=0; i<n; i++){
            String op = sc.next();

            if(op.equals("push_front")){
                int a = sc.nextInt();
                d.addFirst(a);
            }else if(op.equals("push_back")){
                int a2 = sc.nextInt();
                d.addLast(a2);
            }else if(op.equals("pop_front")){
                System.out.println(d.pollFirst());
            }else if(op.equals("pop_back")){
                System.out.println(d.pollLast());
            }else if(op.equals("size")){
                System.out.println(d.size());
            }else if(op.equals("empty")){
                System.out.println(d.isEmpty()?1:0);
            }else if(op.equals("front")){
                System.out.println(d.peekFirst());
            }else if(op.equals("back")){
                System.out.println(d.peekLast());
            }
        }
    }
}