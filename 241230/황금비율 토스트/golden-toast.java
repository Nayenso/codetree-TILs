import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();

        String wd = sc.next();
        LinkedList<Character> li = new LinkedList<>();
        
        for(int i=0; i<wd.length(); i++){
            char c = wd.charAt(i);
            li.add(c);
        }
        ListIterator<Character> I = li.listIterator(li.size());
        for(int i=0; i<m; i++){
            char op = sc.next().charAt(0);
            if(op=='L'){
                if(I.hasPrevious()){
                    I.previous();
                }
            }else if(op=='R'){
                if(I.hasNext()){
                    I.next();
                }
            }else if(op=='D'){
                if(I.hasNext()){
                    I.next();
                    I.remove();
                }
            }else if(op=='P'){
                char t = sc.next().charAt(0);
                I.add(t);
            }
        }
        I = li.listIterator();
        while(I.hasNext()){
            System.out.print(I.next());
        }
    }
}