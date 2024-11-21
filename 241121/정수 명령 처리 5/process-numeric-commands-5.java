import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> li = new LinkedList<>();
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            String op = sc.next();
            if(op.equals("push_back")){
                int a = sc.nextInt();
                li.add(a);
            }else if(op.equals("pop_back")){
                li.remove(li.size()-1);
            }else if(op.equals("size")){
                System.out.println(li.size());
            }else if(op.equals("get")){
                int index = sc.nextInt();
                System.out.println(li.get(index-1));
            }
        }
    }
}