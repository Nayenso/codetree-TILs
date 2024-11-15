import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            String op = sc.next();
            if(op.equals("push_back")){
                int a = sc.nextInt();
                list.add(a);
            }else if(op.equals("pop_back")){
                list.remove(list.size()-1);
            }else if(op.equals("size")){
                System.out.println(list.size());
            }else if(op.equals("get")){
                int index = sc.nextInt();
                System.out.println(list.get(index-1));
            }
        }
    }
}