import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Character> list = new LinkedList<>();
        int n = sc.nextInt(), m = sc.nextInt();
        String s = sc.next();

        for(int i=0; i<n; i++){
            list.add(s.charAt(i));
        }

        ListIterator<Character> I = list.listIterator(list.size());

        for(int i=0; i<m; i++){
            String op = sc.next();

            if(op.equals("L")){
                if(I.hasPrevious()){
                    I.previous();
                }
            }else if(op.equals("R")){
                if(I.hasNext()){
                    I.next();
                }
            }else if(op.equals("D")){
                if(I.hasNext()){
                    I.next();
                    I.remove();
                }
            }else if(op.equals("P")){
                char t = sc.next().charAt(0);
                I.add(t);
            }
        }
        I = list.listIterator();
        while(I.hasNext()){
            System.out.print(I.next());
        }
    }
}