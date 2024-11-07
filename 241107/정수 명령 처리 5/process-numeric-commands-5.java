import java.util.*;

public class Main {
    public static ArrayList<Integer> list;
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        list = new ArrayList<>(); 
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            String temp = sc.next();
            Option(temp);
        }
    }

    public static void Option(String o){
        if(o.equals("push_back")){
            int num = sc.nextInt();
            list.add(num);
        }else if(o.equals("pop_back")){
            int index = list.size()-1;
            list.remove(index);
        }else if(o.equals("size")){
            System.out.println(list.size());
        }else if(o.equals("get")){
            int index2 = sc.nextInt();
            System.out.println(list.get(index2-1));
        }
    }
}