import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> l = new LinkedList<>();
        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<n; i++){
            String temp = sc.nextLine();
            String[] arr = temp.split(" ");
            String op = arr[0];

            switch(op){
                case "push_front":{
                    int num1 = Integer.valueOf(arr[1]);
                    l.addFirst(num1);
                    break;
                }
                case "push_back":{
                    int num2 = Integer.valueOf(arr[1]);
                    l.addLast(num2);
                    break;
                }
                case "pop_front":{
                    int num3 = l.pollFirst();
                    System.out.println(num3);
                    break; 
                }
                case "pop_back":{
                    int num4 = l.pollLast();
                    System.out.println(num4);
                    break;
                }
                case "size":{
                    int cnt = l.size();
                    System.out.println(cnt);
                    break;
                }
                case "empty":{
                    boolean flag = l.isEmpty();
                    int t = (flag == true)?1:0;
                    System.out.println(t);
                    break;
                }
                case "front":{
                    int num5 = l.peekFirst();
                    System.out.println(num5);
                    break;
                }
                case "back":{
                    int num6 = l.peekLast();
                    System.out.println(num6);
                    break;
                }
            }
        }
    }
}