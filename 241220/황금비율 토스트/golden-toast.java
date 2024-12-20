import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        String wd = sc.next();
        LinkedList<Character> li = new LinkedList<>();

        for(int i=0; i<n; i++){
            char c = wd.charAt(i);
            li.addLast(c);
        }
        ListIterator<Character> it = li.listIterator(li.size());

        for(int i=0; i<m; i++){
            char op = sc.next().charAt(0);
            if(op=='L'){
                if(it.hasPrevious()){
                    it.previous();
                }
            }else if(op=='R'){
                if(it.hasNext()){
                    it.next();
                }
            }else if(op=='D'){
                if(it.hasNext()){
                    it.next();
                    it.remove();
                }
            }else if(op=='P'){
                char p = sc.next().charAt(0);
                it.add(p);
            }
        }
        it = li.listIterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }
    }
}