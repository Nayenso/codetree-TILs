import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<n; i++){
            String op = sc.next();
            int item = sc.nextInt();

            if(op.equals("push_back")){
                arr.add(item);
            }else if(op.equals("pop_back")){
                arr.remove(arr.size()-1);
            }else if(op.equals("size")){
                System.out.println(arr.size());
            }else if(op.equals("get")){
                System.out.println(arr.get(item));
            }
        }
    }
}