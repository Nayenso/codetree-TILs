import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[] cTemp = new char[n];
        String str = sc.next();

        LinkedList<Character> c = new LinkedList<>();

        for (int j = 0; j < n; j++) {
            cTemp[j] = str.charAt(j);
        }
        for (int j = 0; j < n; j++) {
            c.add(cTemp[j]);
        }

        ListIterator<Character> i = c.listIterator(c.size());

        for (int j = 0; j < m; j++) {
            char op = sc.next().charAt(0);

            switch (op) {
                case 'L': {
                    if (i.hasPrevious()) {
                        i.previous();
                    }
                    break;
                }
                case 'R': {
                    if (i.hasNext()) {
                        i.next();
                    }
                    break;
                }
                case 'P': {
                    char sub = sc.next().charAt(0);
                    i.add(sub);
                    break;
                }
                case 'D': {
                    if(i.hasNext()){
                        i.next();
                        i.remove();
                    }
                    break;
                }
            }
        }

        i = c.listIterator();
        while (i.hasNext()) {
            System.out.print(i.next());
        }
    }
}