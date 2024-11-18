import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();
        String word = sc.next();
        LinkedList<Character> wd = new LinkedList<>();
        
        for(int i=0; i<m; i++){
            char c = word.charAt(i);
            wd.add(c);
        }

        ListIterator li = wd.listIterator(wd.size());

        for(int i=0; i<n; i++){
            char op = sc.next().charAt(0);
            if(op=='L'){
                if(li.hasPrevious()){
                    li.previous();
                }
            }else if(op=='R'){
                if(li.hasNext()){
                    li.next();
                }
            }else if(op=='D'){
                if(li.hasNext()){
                    li.next();
                    li.remove();
                }
            }else if(op=='P'){
                char c1 = sc.next().charAt(0);
                li.add(c1);
            }
        }
        li = wd.listIterator();

        while(li.hasNext()){
            System.out.print(li.next());
        }
    }
}