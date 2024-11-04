import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<n; i++){
            String temp = sc.nextLine();
            String[] op = temp.split(" ");
            
            if(op[0].equals("push_back")){
                arr.add(Integer.valueOf(op[1]));
            }else if(op[0].equals("pop_back")){
                arr.remove(arr.size()-1);
            }else if(op[0].equals("size")){
                System.out.println(arr.size());
            }else if(op[0].equals("get")){
                int index = Integer.parseInt(op[1]) - 1;
                System.out.println(arr.get(index));
            }
        }
    }
}