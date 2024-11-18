import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> li = new LinkedList<>();

        for(int i=0; i<n; i++){
            String op = sc.next();
            if(op.equals("push_front")){
                int a1 = sc.nextInt();
                li.addFirst(a1);
            }else if(op.equals("push_back")){
                int a2 = sc.nextInt();
                li.addLast(a2);
            }else if(op.equals("pop_front")){
                System.out.println(li.pollFirst());
            }else if(op.equals("pop_back")){
                System.out.println(li.pollLast());
            }else if(op.equals("size")){
                System.out.println(li.size());
            }else if(op.equals("empty")){
                int flag = li.isEmpty()?1:0;
                System.out.println(flag);
            }else if(op.equals("front")){
                System.out.println(li.peekFirst());
            }else if(op.equals("back")){
                System.out.println(li.peekLast());
            }
        }
    }
}